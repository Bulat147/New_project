package Exceptions;

import java.io.IOException;

public class Multicatch {
    public static void main(String[] args) throws AbstractMethodError, IOException{
        methodOne(); // для этого пришлось совать exception-ы в сигнатуру

        // А у этого метода мы обработаем исключения
        try {
            methodTwo();
        }catch(ReflectiveOperationException | TypeNotPresentException e){  // это multicatch - если разные искл хотим
                                                                            // обработать одинаково
        }catch(SecurityException ex){  // так ветвляем, если хотим разные иключения обработать по-разному

        }catch (Exception exc){

        }
    }

    public static void methodOne() throws AbstractMethodError, IOException {}
    public static void methodTwo() throws ReflectiveOperationException, TypeNotPresentException, SecurityException{}
}
