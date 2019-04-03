/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,-10,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,-10,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        testSize(  "check resulting size"
                 , "5"
                 );

        getOne( "get element 0"
               , 0
               ,"-11"
               );
               
        getOne( "get element 3"
               , 3
               ,"2"
               );
               
        getOne( "get last element "
               , orderedList.size()-1
               ,"5"
               );

        removeOne( "remove from the beginning "
                , 0
                ,"[0,0,2,5,]"
                );
   
        removeOne( "remove remove from the middle "
                , 2
                ,"[0,0,5,]"
                );
        
        removeOne( "remove from the end "
                , orderedList.size()-1
                ,"[0,0,]"
                );
               
    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }   
    /**
      run one test
     */
    private static void removeOne( String description
                              , int index
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.remove( index);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }
    /**
      run one test
     */
    private static void testSize( String description
                              //, int value
                              , String expect
                              ) {
        System.out.println( description);
        System.out.println( orderedList);

        // check 
        System.out.println( 
            "size:   "
          + orderedList.size()
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }
         
    /**
      run one test
     */
    private static void getOne( String description
                              , int index
                              , String expect
                              ) {
        System.out.println( description);
        System.out.println( orderedList);
        
        // check 
        System.out.println( 
            "element:   "
          + orderedList.get(index)
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }
     

}    
