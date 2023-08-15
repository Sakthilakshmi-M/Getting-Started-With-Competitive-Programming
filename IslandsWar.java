import java.util.*;
public class IslandsWar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=0;test<t;test++)
		{
		    int bridge,no_of_req;
		    bridge = sc.nextInt();
		    no_of_req = sc.nextInt();
		    ArrayList<ArrayList<Integer>> reqlist = new ArrayList<ArrayList<Integer>>();
		    for(int req=0;req<no_of_req;req++)
		    {
		        int req1 = sc.nextInt();
		        int req2 = sc.nextInt();
		        ArrayList<Integer> al = new ArrayList<Integer>();
		        al.add(req1);
		        al.add(req2);
		        reqlist.add(al);
		    }
		    
		    Collections.sort(reqlist,new Comparator<ArrayList<Integer>>() {
		        public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2)
		        {
		            return list1.get(1).compareTo(list2.get(1));
		        }
		    });
		    
		    int last = -1,ans=0;
		    
            for(ArrayList<Integer> r : reqlist)
            {
                if(last>r.get(0))
                    continue;
                else {
                    last = r.get(1);
                    ans+=1;
                }
                    
            }
		    
		    System.out.println(ans);
		    
		}
	}
}
