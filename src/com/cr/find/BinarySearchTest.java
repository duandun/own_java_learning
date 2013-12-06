package com.cr.find;

/**
 * ���ַ����ң�������Ѿ��ź�������н��в��ң�����������һ���������У�
 * ȡ�м�λ�õ��������midIndex=(beginIndex+endIndex)/2��
 * Ȼ��һ�������۳����룬beginIndex~midIndex��midIndex~endIndex,���Ŀ����T����S[midIndex]���ҵ���
 * �������T<S[midIndex]������beginIndex~midIndex�м������ң����T>S[midIndex],����midIndex~endIndex
 * �м������ң���˷������У�ֱ���ҵ�Ŀ�����ݣ�
 * ��ʼ�Դ����������Լ����������Ч���������Ϊ��T<S[beginIndex]��T>S[endIndex]��beginIndex>endIndex
 * ��beginIndex>S.length-1||endIndex>S.length-1||beginIndex<0||endIndex<0
 *
 */
public class BinarySearchTest {
    /**
     * �ҵ����������±꣬���򷵻�-1��
     * @return index
     */
 public int binarySearch(int dataset[],int target,int beginIndex,int endIndex){
  //����У��
  if(dataset==null||dataset.length==0){
	  return -1;
  }
  //beginIndex,endIndexУ��
  if(beginIndex>endIndex||beginIndex>dataset.length-1||endIndex>dataset.length-1||beginIndex<0||endIndex<0){
   System.out.println("error arguments!");
   return -1;
  }
  
  //��Ч��������
  if(target<dataset[beginIndex]||target>dataset[endIndex]||beginIndex>endIndex){
   return -1;
  }
  
  int midIndex=(beginIndex+endIndex)/2;
  
  //System.out.println(midIndex);
  if(target==dataset[midIndex]){
   return midIndex;
  }
  else if(target<dataset[midIndex]){
   return binarySearch(dataset,target,beginIndex,midIndex-1);//ע��midIndex-1
  }
  else{
   return binarySearch(dataset,target,midIndex+1,endIndex);//ע��midIndex+1
  }
  
 }
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  BinarySearchTest bs=new BinarySearchTest();
  
  int[] data=new int[]{1,3,5,7,9,12};
  
  int index=bs.binarySearch(data,12,0, 5);
  
  System.out.println("The position of the target number in the array is :"+ index);
 }

}

