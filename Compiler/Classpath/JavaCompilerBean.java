@Bean
class JavaCompilerBean
{
    @Bean
    public final void
    java_compiler_compile_program() {
        local _cmd="$1"
        shift
        source "$_cmd"
        main "$@"
    }
}