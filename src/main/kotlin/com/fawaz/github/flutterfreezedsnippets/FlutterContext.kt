package com.fawaz.github.flutterfreezedsnippets

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterContext private constructor() :
    TemplateContextType("FLUTTER_FREEZED_SNIPPETS", "Flutter Freezed snippets") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}