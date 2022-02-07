package com.uoccarpark;//A Simple Java program for a Car Park System (Code) Part 2



//CODE


import java.util.LinkedList;
import java.util.Scanner;


public class car11{
public static void main(String args[]){	
		
	LinkedList <vehicle>list1 = new LinkedList<vehicle>();
	LinkedList <vehicle>list2 = new LinkedList<vehicle>();
		

	Scanner in=new Scanner(System.in);
	System.out.println("");
	System.out.println("\t"+"	*****WELCOME TO UOC CAR PARKING *****");
	System.out.println("\t"+"  FACULTY:UOC FOT ");
System.out.println("\t"+"  Mobile application Development ");
System.out.println("\t"+"  Index: 370, 403, 426 ");
	System.out.println("");
	System.out.println("\t"+"Car Park contains : " + list1);

		
	int inputNum1=0;
	int carNum1;
	int Num2;		
	try{
		
        while(true){ 
		System.out.println("1.Enter park\n2.Exit from park\n3.Display Car List\n4.Exit menu");
		inputNum1=in.nextInt(); 
          switch(inputNum1){ 
          	case 1:
				if(list1.size()<=9){			
					int numOfCars=0;
					vehicle vehicleID=null;
					
					for(int h=0;h<list1.size();h++){
						vehicleID=list1.get(h);
						numOfCars=vehicleID.no;
						System.out.println("Car numbers in the Car Park now "+numOfCars);

					}System.out.println("");	
					System.out.println("Car Park has another : " + (10-numOfCars)+" vacansies");
					
					System.out.println("\t"+"...Please come next car...");
					System.out.println("");	
					System.out.println("Car number "+(list1.size()+1)+" is the next to enter park");
					System.out.print("Enter the car number given above ");
					carNum1=in.nextInt();
						
						if((list1.size()+1)==carNum1){
							list1.add(new vehicle(carNum1));
						}
						else{
							System.out.println("Please enter correct car number ");
						}
								
				}
				else{
					System.out.println("");
					System.out.println("Sorry!!!!");
					System.out.println("No parking space available.Please wait until a slot comes");

					int inputNum2=0;

					for(int h=0;h<list2.size();h++){
						System.out.print(list2.get(h).no+" ");
					}
					System.out.println("  Cars are waiting to enter park");
					System.out.println("Would you like to enter waiting list???");
					System.out.println("1.yes\n2.no");
					inputNum2=in.nextInt();


					switch(inputNum2){
						case 1:
							System.out.println("Car number "+(list2.size()+11)+" is the next to enter Parking");
							System.out.print("Enter the car number given above ");
							int waitingCarNum;
							waitingCarNum=in.nextInt();

							if((list2.size()+11)==waitingCarNum)
							{
								for(int i=0;i<list2.size()-1;i++){
									vehicle temp=list2.get(i);
									System.out.println(temp.no);
								}

								list2.add(new vehicle(waitingCarNum));
								System.out.println("Waiting List ");
								for(int h=0;h<list2.size()-1;h++){
									System.out.print(list2.get(h).no+" ");
								}
								System.out.println("");


							}
							else{
								System.out.println("Please enter correct car number ");
							}


							break;



						case 2:
							System.out.println("Thank you");
							break;

					}
					break;


				}
				break;



			  case 2:
				  System.out.println("1.Depart from main park\n2.Depart From Waiting List");
				  int inputNum3=in.nextInt();

				  try{
					  switch(inputNum3) {
						  case 1:
							  if(list1.size()==0){
								  System.out.println("park is empty. If you wish you can Enter your car now");
							  }
							  else{
								  System.out.println("Car numbers in the Car park.Choose yours ");
								  vehicle qsa=null;
								  int ssd=0;
								  for(int h=0;h<list1.size();h++ ){
									  qsa=list1.get(h);
									  ssd=qsa.no;
									  System.out.println("in Park "+ssd);
								  }

								  System.out.println("Enter the number of your car");
								  int RemoveCar=0;
								  RemoveCar = in.nextInt();

								  int sd=0;

								  int which=RemoveCar;// wanted car

								  for(int h=0;h<list1.size();h++){
									  vehicle qa=list1.get(h);
									  if(qa.no!=which){
										  qa=list1.get(h);
										  continue;
									  }

									  else{
										  vehicle kl=null;
										  for(int u=0;u<list1.size()-1;u++){
											  kl=list1.get(u);
											  if(kl.no!=which){

												  kl.mvs+=2;
											  }
											  else
												  break;
										  }
										  for(int v=list1.size();(list1.get(h).no!=which);v--){

											  kl.mvs+=1;
										  }
										  System.out.println("moves "+ list1.get(h).incmoves(1));
										  list1.remove(h);
										  break;
									  }

								  }




								  if(list2.size()>0){
									  System.out.println("So car number "+list2.getFirst()+"  to car park:");



									  list1.add(new vehicle(list2.getFirst().no));
									  list2.remove(0);

									  System.out.println("New car list in car park : " + list1);
									  System.out.println("");
								  }
								  else{
									  System.out.println("No cars in waiting list to enter park");
								  }

							  }break;

						  case 2: if(list2.size()==0){
							  System.out.println("There is no cars waiting in the list");
						  }
						  else{
							  System.out.println("Cars in waiting list"+list2);
							  System.out.print("Enter your car number");
							  int removeWaitCar=in.nextInt();
						  }
							  break;
						}
					}
					catch(Exception e){
						System.out.println("You have entered wrong Index number.please check");
					}
					break;			
              
			  
				
	

				case 3:
					System.out.println("What do you want to see?" );

					System.out.println("1.Main park\n2.Waiting list");
					int displayNum=in.nextInt();
					try{
						switch(displayNum){
							case 1:								
								vehicle carID1=null;
								int carList1=0;
											
								for(int h=0;h<list1.size();h++){
									carID1=list1.get(h);
									carList1=carID1.no;
									System.out.println("Park now "+carList1);
								}
								break; 
							case 2:
								vehicle carID2=null;
								int carList2=0;
											
								for(int h1=0;h1<list2.size();h1++){
									carID2=list2.get(h1);
									carList2=carID2.no;
									System.out.println(carList2+" is in the Waiting list now");
								
								}break;

						}
					}
					catch(Exception e){
						System.out.println("You have enter wrong option number.please check again");
					}	
					break;
					
					
				case 4:
                        System.out.println("Have a nice day");
				
				
				default: System.exit(0);		
				




		
          }// switch
		 
	 } 
	}
	catch(Exception e){
		System.out.println(e+"You may have entered a wrong charactor.please check");
	} 

  }         
    
}


class vehicle{
	
	int no;
	int mvs;
	
	public vehicle(int abc){
		no=abc;
		mvs=0;
	}
	
	public int incmoves(int x){
		return (mvs+x);
	}


}

