int equilibriumPoint(long long a[], int n) {
    int left_sum=0,right_sum=0,i;
    if(n==1){
        return 1;
    }
    for(i=0;i<n;i++){
        right_sum+=a[i];
    }
    for(i=0;i<n;i++){
        right_sum=right_sum-a[i];
        if(right_sum==left_sum){
            return i+1;
        }
        left_sum+=a[i];
        
    }
    return -1;
    // Your code here
