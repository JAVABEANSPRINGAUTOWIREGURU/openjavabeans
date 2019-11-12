import Beans.System.SystemUtilsJavaBeanCoreServiceProviderAdapterFactory;

@Bean
class HelloWorldProviderImplementationService implements java.io.Serializable
{
    public final void
    main() {
        this.print_string "Hello, World!";
    }

    public final void
    print_string() {
        System.out.println "$1"
    }
}