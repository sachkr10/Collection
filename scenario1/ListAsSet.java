import java.util.ArrayList;

class ChangingBehaviourOfList<Integer> extends ArrayList
{
    @Override
    public boolean add(Object a)
    {
        if(this.contains(a)){
            return true;
        }
        else
          return super.add(a);
    }
}

public class ListAsSet{
    public static void main(String[] args) {
        ChangingBehaviourOfList list = new ChangingBehaviourOfList();
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(list);
    }
}

