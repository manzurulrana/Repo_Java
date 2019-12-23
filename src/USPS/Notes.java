//Class Notes

// Variables

// byte DogAge=12; //This is used to take space for small digits
//      short bigShort=4423;
//      int AccountBalance = 297446298;
//      long AnotherAccountBalance=2304832084084023984L;
//      float averageAge=33.22f; //stores smaller digits
//      double average=38.99; //stores larger digits
//      boolean isDoorClosed=true; //only true or false (smallest kind of datatypes)
//      char firstNameInitial='M';

// Constants are block-scoped, much like variables defined using the data types and variable name.
// The value of a constant cannot change through reassignement, and it can't be redeclared.

// final -- used to locked down a variable value. That variable can then no longer be assigned.

//\"m"\ -- Used to put answers in quotes.

//variable example
//int base;
//        int height;
//        int area;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("We are finding the area of a triangle");
//        System.out.println("Enter the value of the base");
//        String base1 = scanner.nextLine();
//        base=Integer.parseInt(base1);
//        System.out.println("Enter the value of the height");
//        String height1 = scanner.nextLine();
//        height=Integer.parseInt (height1);
//        area = (base * height)/2;
//        System.out.println("The area of the triangle is " + area);

//Scanner Example

// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter your name");
// String name = scanner.nextLine();
// System.out.println(name);

// * 1. Declare a Variable as following: String myStatement = "I am a good programmer";
// * 2. Find the length of of "myStatement"
// * 3. Convert all values to lowercase
// * 4. See if statement contains mohammad
// * 5. find the 5th index of the statement
// * 6. find if the statement is empty
// * 7. compare the "myStatement" with "technosoft"
// * 8. Check if message starts with "Welcome"
// * 9. Check if message ends with "Good Bye"

// String myStatement = "I am a good programmer";
// System.out.println(myStatement.length());
// System.out.println(myStatement.toLowerCase());
// System.out.println(myStatement.contains("mohammed"));
// System.out.println(myStatement.charAt(5));
// System.out.println(myStatement.isEmpty());
// System.out.println(myStatement.equals("technosoft"));
// System.out.println(myStatement.startsWith("Welcome"));
// System.out.println(myStatement.endsWith("Good Bye"));

//Rules

//Cannot be reserved keyword
//should be meaningful
//cannot start with number
//cannot contain a space or hyphen
//they are case-sensative
//should be camelCase

//Arrays

//        String[] cars = new String[5];
//        cars[0] = "Chevy";
//        cars[1] = "Honda";
//        cars[2] = "kia";
//        cars[3] = "toyota";
//        cars[4] = "bmW";
//
//        int size = cars.length;
//        System.out.println("the array length is: " + size);
//
//        boolean isEqual = cars[4].equalsIgnoreCase("bmw");
//        System.out.println(isEqual);


//        String[] daysOfweek = new String[7];
//        daysOfweek[0] = "Sunday";
//        daysOfweek[1] = "Monday";
//        daysOfweek[2] = "Tuesday";
//        daysOfweek[3] = "Wednesday";
//        daysOfweek[4] = "Thursday";
//        daysOfweek[5] = "Friday";
//        daysOfweek[6] = "Saturday";
//
//        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

