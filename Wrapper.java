


class Wrapper
{
    public static void main(String A[])
    {
        int no = 11;
        Integer iobj = new Integer(no);     //boxing:converting premitive datatype to wrapper

        System.out.println(no);
        System.out.println(iobj);

        int X = iobj;                       //uncoxing: converting wrapper to premitive
        System.out.println(X);


    }
}