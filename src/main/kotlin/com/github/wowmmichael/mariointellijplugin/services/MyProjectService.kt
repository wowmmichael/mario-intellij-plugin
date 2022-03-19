package com.github.wowmmichael.mariointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.wowmmichael.mariointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
