public class ArrayAlgorithmsRunner {
    public static void main(String[] args) {
        // 1. create four Person objects with these names and ages:
        //    Nancy, 17
        //    Tim, 18
        //    Andrew, 16
        //    Sarah, 19
        /*
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
         */

        /*
        int[] nums = {5, 10, 15, 12, 2, 4};
        ArrayAlgorithms.multiplyBy(nums, 6);
        // original nums array IS modified
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int[] nums2 = {-5, -7, 14, 0, 5, 20, -30};
        ArrayAlgorithms.multiplyBy(nums2, -12);
        // original nums2 array IS modified
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        boolean[] bools = {false, true, true, false, true};
        ArrayAlgorithms.flipBool(bools);

        // original bools array IS modified
        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i] + " " );
        }
        System.out.println();

        String[] words = {"hello", "hola", "hi", "what's up?", "dude!"};
        ArrayAlgorithms.addExclamation(words);
        // original words array IS modified
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " " );
        }
         */

        /*
        int[] nums = {5, 1, 3, 4, 7, 6};
        ArrayAlgorithms.shiftLeft(nums);

        // original nums array IS modified; all elements shifted left 1
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftLeft(nums2);

        // original nums2 array IS modified; all elements shifted left 1
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // shift nums2 AGAIN:
        ArrayAlgorithms.shiftLeft(nums2);

        // original nums2 array shifted left a second time!
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        */

        /*
        int[] nums = {5, 1, 3, 4, 7, 6};
        ArrayAlgorithms.shiftRight(nums);
        // original nums array IS modified; all elements shifted right 1
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftRight(nums2);
        // original nums2 array IS modified; all elements shifted right 1
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // shift nums2 AGAIN:
        ArrayAlgorithms.shiftRight(nums2);
        // original nums2 array shifted right a second time!
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

         */


        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverse(even);
        // original array IS modified: elements are reversed!
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverse(odd);
        // original array IS modified: elements are reversed!
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverse(even2);
        // original array IS modified: elements are reversed!
        for (int i = 0; i < even2.length; i++) {
            System.out.print(even2[i] + " ");
        }
        System.out.println();

        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverse(odd2);
        // original array IS modified: elements are reversed!
        for (int i = 0; i < odd2.length; i++) {
            System.out.print(odd2[i] + " ");
        }
        System.out.println();

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
