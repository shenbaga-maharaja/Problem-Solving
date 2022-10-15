/**
	* @shenbaga-maharaja
  	* Coded To Code
	* Java Script Program To Find Multiples of 3 and 5
	* If We List All The Natural Numbers Below 10 That Are Multiples Of 3 Or 5, 
		We Get 3, 5, 6 And 9. The Sum Of These Multiples Is 23.

	* Find The Sum Of All The Multiples Of 3 Or 5 Below The Provided Parameter Value Number.

	* Test Cases
		multiplesOf3and5(10) should return a number.
		multiplesOf3and5(49) should return 543.
		multiplesOf3and5(1000) should return 233168.
		multiplesOf3and5(8456) should return 16687353.
		multiplesOf3and5(19564) should return 89301183.
**/

function MultiplesOf3and5(number) {
  let sum=0;
  for(let i=1;i<number;i++){
    if(i%3==0||i%5==0){
      sum+=i;
    }
  }
  return sum;
  }

MultiplesOf3and5(1000);
