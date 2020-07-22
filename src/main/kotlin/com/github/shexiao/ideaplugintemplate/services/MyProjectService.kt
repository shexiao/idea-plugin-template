package com.github.shexiao.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.shexiao.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
