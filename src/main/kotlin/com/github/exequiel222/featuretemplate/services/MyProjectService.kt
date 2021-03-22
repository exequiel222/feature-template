package com.github.exequiel222.featuretemplate.services

import com.github.exequiel222.featuretemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
