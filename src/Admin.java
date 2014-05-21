import java.util.ArrayList;
import java.util.List;

public class Admin
{

    public static void main(String args[])
    {
        List result = test(100);
        show(result);
    }

    private static List test(int row)
    {

        List result = new ArrayList();
        for (int i = 0; i < row; i++)
        {

            Node[] arr = getLastArr(result, i - 1);

            Node[] nodes = new Node[i + 1];
            for (int j = 0; j < nodes.length; j++)
            {

                Node left = getNode(arr, j - 1);
                Node right = getNode(arr, j);

                nodes[j] = new Node(1, left, right);
            }
            result.add(nodes);
        }
        return result;
    }

    private static Node getNode(Node[] arr, int idx)
    {
        if (arr == null || idx > arr.length - 1 || idx < 0)
        {
            return null;
        }
        return (Node) arr[idx];
    }

    private static Node[] getLastArr(List data, int idx)
    {
        if (data == null || idx > data.size() - 1 || idx < 0)
        {
            return null;
        }
        return (Node[]) data.get(idx);
    }

    private static void show(List result)
    {
        for (int i = 0; i < result.size(); i++)
        {
            Node[] nodes = (Node[]) result.get(i);
            for (int j = 0; j < nodes.length; j++)
            {
                System.out.print(nodes[j] + " ");
            }
            System.out.println();
        }
    }
}

class Node
{

    private long num = 0;

    private Node left;

    private Node right;

    public Node(int num, Node left, Node right)
    {
        this.num = num;
        this.left = left;
        this.right = right;
    }

    public String toString()
    {
        long leftNum = 0;
        long rightNum = 0;
        if (left != null)
        {
            leftNum = left.num;
        }
        if (right != null)
        {
            rightNum = right.num;
        }
        if (leftNum + rightNum == 0)
        {
            return num + "";
        }
        num = leftNum + rightNum;
        return num + "";
    }
}