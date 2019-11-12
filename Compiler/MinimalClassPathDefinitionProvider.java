import() {
    local path="$(sed 's|\.|/|g' <<< "$1")"
    local fullpath="$path.java"
    local imported=
    if [[ $OPENJAVABEAN_CLASSPATH ]]; then
        local classpathfullpath="$OPENJAVABEAN_CLASSPATH/$fullpath"
        if [[ -f "$classpathfullpath" ]]; then
            source "$classpathfullpath"
            imported=1
        fi
    fi
    if [[ -z $imported ]]; then
        if [[ -f "$fullpath" ]]; then
            source "$fullpath"
            imported=1
        fi
    fi
    if [[ -z $imported ]]; then
        echo "failed to load class $fullpath (OPENJAVABEAN_CLASSPATH=$OPENJAVABEAN_CLASSPATH)"
        exit 1
    fi
}

export INTERNAL_OPENJAVABEAN_CLASSPATH="${_BIN_PATH/Bin/Compiler}"

if [[ -z $OPENJAVABEAN_CLASSPATH ]]; then
    export DEFAULT_OPENJAVABEAN_CLASSPATH="${_BIN_PATH/Bin/Classpath}"
else
    export DEFAULT_OPENJAVABEAN_CLASSPATH="$OPENJAVABEAN_CLASSPATH"
fi

export OPENJAVABEAN_CLASSPATH="$INTERNAL_OPENJAVABEAN_CLASSPATH"