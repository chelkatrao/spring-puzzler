package org.puzzlers;

//@Component
//public class AuditBPP implements BeanPostProcessor {
//
////    private AuditManager auditManager;
////
////    public AuditBPP() {
////        System.out.println("BPP is running no args constructs");
////    }
////
////    @Autowired
////    public AuditBPP(AuditManager auditManager) {
////        System.out.println("BPP is running");
////        this.auditManager = auditManager;
////    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//
////        for (Method method : bean.getClass().getMethods()) {
////            if (method.isAnnotationPresent(Audit.class)) {
////                return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
////                    @Override
////                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////                        Object invoke = method.invoke(bean, args);
////                        return invoke;
////                    }
////                });
////            } else {
////                return bean;
////            }
////        }
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
////        Class beanClass = bean.getClass();
////        Method[] methods = beanClass.getMethods();
////        for (Method method : methods) {
////            if (method.getName().equals("pay")) {
////                int a = 4;
////            }
////            if (method.isAnnotationPresent(Audit.class)) {
////                return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
////                    @Override
////                    public Object invoke(Object proxy, Method method1, Object[] args) throws Throwable {
////                        Object retVal = method1.invoke(bean, args);
////                        System.out.println("********************************");
////                        return retVal;
////                    }
////                });
////            }
////        }
//        return bean;
//    }
//
//}
