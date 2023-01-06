public class ArrayAlgorithmsRunner {
    public static void main(String[] args) {
        // 1. create four Person objects with these names and ages:
        //    Nancy, 17
        //    Tim, 18
        //    Andrew, 16
        //    Sarah, 19
        Person person1 = new Person("Nancy", 17);
        Person person2 = new Person("Tim", 18);
        Person person3 = new Person("Andrew", 16);
        Person person4 = new Person("Sarah", 19);

        // 2. add them to a new Person[] array in the order shown above
        Person[] persons = {person1, person2, person3, person4};

        // 3. call the static method and pass the array in as the parameter
        ArrayAlgorithms.introduceAdults(persons);


        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {10, 11, 12, 13, 14, 15, 16, 17};
        int[] combined = ArrayAlgorithms.combine(nums1, nums2);
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined.length + " elements");

        int[] nums3 = {5, 8, 6, 2};
        int[] nums4 = {1, 7, 10, 0, 9};
        int[] combined2 = ArrayAlgorithms.combine(nums3, nums4);
        for (int i = 0; i < combined2.length; i++) {
            System.out.print(combined2[i] + " ");
        }
        System.out.println();
        System.out.println("combined list has " + combined2.length + " elements");




    }
}
