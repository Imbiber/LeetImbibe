class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n1=nums1.length;
      int n2=nums2.length;
      int n=n1+n2;
      int[] arr=new int[n];
      int i=0,j=0,k=0;
      while(i<=n1&&j<=n2){
          if (i==n1){
              while(j<n2) arr[k++]=nums2[j++];
                  break;
              }
              else if(j==n2){
              while(i<n1) arr[k++]=nums1[i++];
                  break;
          }
          if(nums1[i]<nums2[j]){
              arr[k++]=nums1[i++];
          }else{
              arr[k++]=nums2[j++];
          }  
      }
      if(n%2==0)return (double)(arr[n/2-1]+arr[n/2])/2;
      else return (arr[n/2]);
    }
}