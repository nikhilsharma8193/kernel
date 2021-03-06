package com.wizpanda

import com.wizpanda.converts.FormattedStringValueConverter
import grails.plugins.*

class KernelGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.1.10 > *"

    def profiles = ['web']

    def pluginExcludes = [
            '**/com/wizpanda/UrlMappings*/**'
    ]

    String title = "Kernel Grails Plugin" // Headline display name of the plugin
    String author = "Shashank Agrawal"
    String authorEmail = ""
    String description = "A Grails plugin to provide some core functionality and utility classes"

    // URL to the plugin's documentation
    //String documentation = "http://grails.org/plugin/kernel"

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    //String license = "APACHE"

    Map organization = [name: "Wiz Panda", url: "http://www.my-company.com/"]

    Map issueManagement = [system: "GITHUB", url: "https://github.com/wizpanda/kernel/issues"]

    Map scm = [ url: "https://github.com/wizpanda/kernel" ]

    Closure doWithSpring() {
        { ->
            formattedStringConverter(FormattedStringValueConverter)
        }
    }
}
