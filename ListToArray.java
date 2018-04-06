	public static void countSameNumber1(int[] number){  
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();  
        for(int i =0;i < number.length;i++){  
            if(!hm.containsKey(number[i])){  
                hm.put(number[i],1);  
            }  
            else{  
                hm.put(number[i],(hm.get(number[i]))+1);  
            }  
        }  
        for(Entry<Integer, Integer> entry:hm.entrySet()){  
            System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次");  
        }  
    }
	public static void countSameNumber2(int[] number){  
        Arrays.sort(number);  
        //若数组内为1 2 3 4 1 2 ,则创建一个大小为5的数组，下标为0-4.  
        int[] numbers = new int[number[number.length -1] + 1];  
        for(int i =0;i< numbers.length;i++){  
            numbers[i] = 0;  
        }  
        //i即为原数组中数字，numbers[i]存放重复的次数  
        for(int i =0; i<number.length;i++){  
            int temp = number[i];  
            numbers[temp]++;  
        }  
        //打印  
        for(int i =0;i < numbers.length;i++){  
            if(numbers[i] == 0){  
                continue;  
            }  
            System.out.println(i + "出现了" + numbers[i] + "次");  
        }  
    }
	public static void countSameNumber3(int[] number){  
	       ArrayList<Integer> al = new ArrayList<Integer>();  
	       ArrayList<Integer> all = new ArrayList<Integer>();  
	       for(int i =0;i<number.length;i++){  
	           if(!al.contains(number[i])){  
	               al.add(number[i]);  
	           }  
	       }  
	       for(int i=0;i<number.length;i++){  
	           all.add(number[i]);  
	       }  
	       for(int i=0;i<al.size();i++){  
	           int result = Collections.frequency(all,al.get(i));  
	           System.out.println(al.get(i) + "出现了" + result + "次");  
	       }  
	   } 
