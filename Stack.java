import java.util.Scanner;

public class Stack {
	public static void main(String []args) {
		Node<Integer> node=new Node<Integer>();//�׻� �ֻ��� ��带 ����Ŵ
		Node<Integer> tnode = null;//Ž���� ���� ���ο� ���۷���
		Node<Integer> ttnode = null;//������ ���� ���ο� ���۷���
		Scanner scann = new Scanner(System.in);
		int select;
		Integer data;
		while(true) {
			System.out.print("\n1. push 2. pop 3.show 4.exit: ");
			select=scann.nextInt();
			if(select==1) {//push �Է�
				System.out.println("PUSH data : ");
				data = scann.nextInt();
				if(node==null) {//no node
					node=new Node<Integer>();
				}else {//�����Ͱ� ����
					tnode=node;//������ Node Ž��
					while(true) {
						if(tnode.getT()==null) {//Ž������ ����� �����Ͱ� �������
							tnode.setT(data);
							break;//�ݺ��� Ż��
						}else {//���� ��尡 �� ����϶����� �ݺ��� ����
							if(tnode.getNext()!=null) {//���� ��尡 ������
								tnode=tnode.getNext();//�������� �̵�								
							}else {//���� ����� �����Ͱ� ���������� ���� ��尡 �������� ����
								tnode.setNext(new Node<Integer>(data));//���� ��忡 �����͸� �ָ鼭 ����
							}
						}
					}//���ѹݺ�
				}
			}else if(select==2) {//pop ����
				int trace=0;//���� Ƚ�� ����
				tnode=node;
				if(node!=null) {//��尡 ����
					while(true) {
							if(tnode.getNext()==null) {//Ž������ ����� ���� ��尡 �������, ������ ���
								System.out.println("POP : "+tnode.getT());
								
								if(trace!=0) {//�ѹ��̻� ����. ù���� �����Ͱ� �ƴ�
									ttnode.setNext(null);
								}else {//�ѹ��� �ȵ���. ù���� ������
									node=null;
								}
								break;
							}else {//���� ��尡 �� ����϶����� �ݺ��� ����
								ttnode=tnode;
								tnode=tnode.getNext();
								trace++;//���� Ƚ�� ����
							}
						}//���ѹݺ�
					
				}else {//�ϳ��� ��嵵 �������� ����
					System.out.println("No node");
				}
			}else if(select==3) {//Show
				tnode=node;
				if(tnode!=null) {//��尡 ����
					while(true) {
						System.out.println(tnode.getT());//���� ��尡 ���� �� ���
						if(tnode.getNext()==null) {//Ž������ ����� ���� ��尡 �������
							break;
						}else {//���� ��尡 �� ����϶����� �ݺ��� ����
							tnode=tnode.getNext();
						}
					}//���ѹݺ�
				}else {//�Ѱ��̻��� ��尡 �������� ����
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
