package com.github.yunabraska.githubworkflow.quickfixes;

import com.github.yunabraska.githubworkflow.highlights.SyntaxAnnotation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

public record QuickFixExecution(SyntaxAnnotation syntaxAnnotation, Project project, Editor editor, PsiFile file) {
}
