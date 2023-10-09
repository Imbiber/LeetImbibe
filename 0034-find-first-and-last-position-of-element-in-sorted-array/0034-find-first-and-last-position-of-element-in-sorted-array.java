class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums, target);
        int last = last(nums, target);
        return new int[]{first,last};
        
 
    }
    public  int first(int arr[], int x) {
		int start=0, end=arr.length-1;
		
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				result=mid;
				end=mid-1;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			else end=mid-1;
			
		}
		return result;
	}
    public int last(int arr[], int x) {
		int start=0, end=arr.length-1;
		
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				result=mid;
				start=mid+1;
			}
			else if(arr[mid]<x) {
				start=mid+1;
			}
			else end=mid-1;
			
		}
		return result;
	}
}