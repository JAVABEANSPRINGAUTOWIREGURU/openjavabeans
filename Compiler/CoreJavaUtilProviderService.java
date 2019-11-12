#!/usr/bin/env bash

set -f

do_nothing() { :; }

# Define javabean-compliant keywords
@Bean() {
    do_nothing # Required for JavaBean compliance
}

@Bean
class() { # class_name
    current_class="$1"
}

# Once bootstrapped, define main java bean class provider
@Bean
class JavaBeanClassBase implements java.lang.Object
{
    # Implement comments in compiler
    @Bean
    //() { :; }

    @Bean
    /*() { :; }
    
    @Bean
    */() { :; }

    // Working comments
    /* Working comments */

    // Currently compiled JavaBean class
    @Bean
    current_class=
}

@Bean
class JavaCompilerBeanClassProviderClassInstanceClass implements JavaBeanClassBase
{
    @Bean
    void() { :; }

    @Bean
    _get_next_line() { # caller
        local acaller=''
        IFS=' ' read -r -a acaller<<<"$1"
        local bean=${acaller[0]}
        local previous_line=$(( $bean + 1 ))
        local funcline="$(sed "${previous_line}q;d" "${acaller[1]}")"
        echo "$funcline"
    }

    @Bean
    public() {
        local acaller="$(caller)"
        local funcline="$(_get_next_line "$acaller")"
        local funcname="$(grep -oE '[A-Za-z0-9_]+' <<< "$funcline")"
        local function_name="this.$funcname"
        local function_source="function this.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source"
        local function_source2="function ${current_class}.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source2"
    }

    @Bean
    private() {
        local acaller="$(caller)"
        local funcline="$(_get_next_line "$acaller")"
        local funcname="$(grep -oE '[A-Za-z0-9_]+' <<< "$funcline")"
        local function_name="this.$funcname"
        local function_source="function this.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source"
        local function_source2="function ${current_class}.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source2"
    }
    
    @Bean
    protected() {
        local acaller="$(caller)"
        local funcline="$(_get_next_line "$acaller")"
        local funcname="$(grep -oE '[A-Za-z0-9_]+' <<< "$funcline")"
        local function_name="this.$funcname"
        local function_source="function this.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source"
        local function_source2="function ${current_class}.${funcname}() { $funcname \"\$@\"; };"
        eval "$function_source2"
    }}
    
    @Bean
    final() { :; }

    @Bean
    new() {
        echo "$@"
    }
}