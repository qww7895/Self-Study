import java.util.Scanner;

public class Qeueue {
	public static void main(String []args) {
		Node<Integer> node=new Node<Integer>();//항상 최상위 노드를 가르킴
		Node<Integer> tnode = null;//탐색을 위한 새로운 레퍼런스
		Scanner scann = new Scanner(System.in);
		int select;
		Integer data;
		while(true) {
			System.out.print("\n1. push 2. pop 3.show 4.exit: ");
			select=scann.nextInt();
			if(select==1) {//push 입력
				System.out.println("PUSH data : ");
				data = scann.nextInt();
				if(node==null) {//no node
					node=new Node<Integer>();
				}else {//데이터가 존재
					tnode=node;//최하층 Node 탐색
					while(true) {
						if(tnode.getT()==null) {//탐색중인 노드의 데이터가 비어있음
							tnode.setT(data);
							break;//반복문 탈출
						}else {//다음 노드가 빈 노드일때까지 반복문 수행
							if(tnode.getNext()!=null) {//다음 노드가 존재함
								tnode=tnode.getNext();//다음노드로 이동								
							}else {//현재 노드의 데이터가 존재하지만 다음 노드가 존재하지 않음
								tnode.setNext(new Node<Integer>(data));//다음 노드에 데이터를 주면서 생성
							}
						}
					}//무한반복
				}
			}else if(select==2) {//pop 삭제
				if(node!=null) {//노드가 존재
					System.out.println("POP : "+node.getT());
					node=node.getNext();//최상위를 가르키던 노드를 다음 노드로 옮김
										//node가 가르키고 있었던 노드는 Garbage Collector에게 의해 삭제됨
				}else {//하나의 노드도 생성하지 않음
					System.out.println("No node");
				}
			}else if(select==3) {//Show
				tnode=node;
				if(tnode!=null) {//노드가 존재
					while(true) {
						System.out.println(tnode.getT());//현재 노드가 가진 값 출력
						if(tnode.getNext()==null) {//탐색중인 노드의 다음 노드가 비어있음
							break;
						}else {//다음 노드가 빈 노드일때까지 반복문 수행
							tnode=tnode.getNext();
						}
					}//무한반복
				}else {//한개이상의 노드가 존재하지 않음
					System.out.println("No node");
				}
				
			}else if(select==4){//exit
				break;
			}else {
				System.out.println("miss selection");
			}
		}
	}




}
