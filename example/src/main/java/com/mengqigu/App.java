package com.mengqigu;

import java.util.*;

import org.im4java.core.*;
import org.im4java.script.*;
import org.im4java.process.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String myPath="/usr/local/bin/";
        ProcessStarter.setGlobalSearchPath(myPath);

        String pwd = System.getProperty("user.dir");
        String imageDir = pwd + "/images/";

        // ConvertCmd cmd = new ConvertCmd();
        //
        // // create the operation, add images and operators/options
        // IMOperation op = new IMOperation();
        // op.addImage(imageDir + "1.png");
        // op.resize(800,600);
        // op.addImage(imageDir + "myimage_small.jpg");
        //
        // // execute the operation
        // try {
        //     cmd.run(op);
        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }

        CompareCmd compareCmd = new CompareCmd();
        compareCmd.setSearchPath("/Users/mengqigu/Developer");

        IMOperation compareOp = new IMOperation();
        // NOTE: -metric AE prints to STD ERR!
        compareOp.metric("AE");

        // TODO: Test this option
        compareOp.fuzz(new Double(5.0), new Boolean(true));

        compareOp.addImage(imageDir + "1.png");
        compareOp.addImage(imageDir + "2.png");

        // TODO: save diff to a different image
        compareOp.addImage(imageDir + "diff.png");

        try {
            compareCmd.run(compareOp);
        } catch (Exception e) {
            System.out.println("Exception by run(): " + e.toString());
        }

        System.out.println("Example finished");
    }
}
