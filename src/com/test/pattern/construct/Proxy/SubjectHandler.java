package com.test.pattern.construct.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 * 代理类是在运行时生成的，编译完后并没有实际的class文件，而是在运行时动态生成的类字节码，并加载到jvm中
 */
public class SubjectHandler implements InvocationHandler {

    private Subject subject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("向目标发送请求");
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
        System.out.println("目标相应的请求");
        return null;
    }

    public static Subject createProxy() {
        return (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, new SubjectHandler());
    }


   /*
    代理还可以使用CGLiB实现动态代理
    <dependency>
        <groupId>cglib</groupId>
        <artifactId>cglib-nodep<artifactId>
        <version>3.1<version>
    </dependency>

     public class SubjectProxy implements MethodInterceptor {
        private Object target;
        //创建代理对象
        public Object getInstance(Object target) {
            this.target = target;
            Enhancer enhancer = new Enhancer();
            enhance.setSuperclass(this.target.getClass());
            //回调方法
            enhancer.setCallback(this);
            return enhancer.create();
        }
        @Override
        public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy) throws  Throwable{
            System.out.println("向目标发送请求");
            methodProxy.invokeSuper(o,objects);
            System.out.println("目标相应的请求");
            return null;
        }
    }

    public  class  CglibProxyClient{
        public static void main(String[] args) {
            SubjectProxy subjectProxy =new SubjectProxy();
            Subject subject = (RealSubject)subjectProxy.getInstance(new RealSubject());
            subject.request();
        }
    }

   * */

}







