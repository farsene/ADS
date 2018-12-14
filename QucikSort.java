/**
 * @author Andrei Geadau
 *The full implementation of QueueList can be found in my other directories
 */
public class QuickSort {
	
	public static void sort(QueueList<Integer> q) {
		
		if(q.size() < 2) {
			return;
		}
		
		//Divide
		int pivot = q.first();
		QueueList<Integer> L = new QueueList<>();
		QueueList<Integer> E = new QueueList<>();
		QueueList<Integer> G = new QueueList<>();
		
		while(!q.isEmpty()) {
			int el = q.deque();
			if(el<pivot) {
				L.enque(el);
			}else if(el > pivot) {
				G.enque(el);
			}else {
				E.enque(el);
			}
		}

		//CONQUER
		sort(L);
		sort(G);
		
		//MERGE
		while(!L.isEmpty()) {q.enque(L.deque());}
		while(!E.isEmpty()) {q.enque(E.deque());}
		while(!G.isEmpty()) {q.enque(G.deque());}
	}
}
