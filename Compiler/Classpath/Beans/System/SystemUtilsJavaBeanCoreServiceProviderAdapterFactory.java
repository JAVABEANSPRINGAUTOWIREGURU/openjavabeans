@Bean
class SystemUtilsJavaBeanCoreServiceProviderAdapterFactory implements JavaCompilerBeanClassProviderClassInstanceClass
{
    @Bean
    function System.out.println() {
        echo "$@"
    }
}