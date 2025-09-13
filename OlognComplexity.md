In this log(n) complexity the time increases linearly but the input varies exponentially
<br>
This means that for the larger input the value is lesser and the time taken is lesser.
<br>
Example code:
<br>
int n = 10;
<br>
for(int i = 0;i < n ; i = i*10){
<br>
//The input given here is larger i = i * 10;
<br>
//The output given here is small only i is given.
<br>
    System.out.println(i);
}
<br>
It might seem that it is raising exponentially, but the output is increasing linearly
<br>
![alt text](image-2.png)