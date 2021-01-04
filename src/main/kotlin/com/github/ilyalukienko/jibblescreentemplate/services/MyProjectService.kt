package com.github.ilyalukienko.jibblescreentemplate.services

import com.intellij.openapi.project.Project
import com.github.ilyalukienko.jibblescreentemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
