@Bean
class JavaCompilerBean
{
    @Bean
    public final void
    java_compiler_compile_program() {
        local _cmd="$1"
        shift
        export OPENJAVABEAN_CLASSPATH="$DEFAULT_OPENJAVABEAN_CLASSPATH"
        source "$_cmd"
        main "$@"
    }
}