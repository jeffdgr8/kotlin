/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.symbolDeclarationOverridesProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.symbolDeclarationOverridesProvider.AbstractOverriddenDeclarationProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleOverriddenDeclarationProviderTestGenerated extends AbstractOverriddenDeclarationProviderTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Dependent,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInOverriddenSymbols() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/backingField.kt");
    }

    @Test
    @TestMetadata("inAnonymousClass.kt")
    public void testInAnonymousClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inAnonymousClass.kt");
    }

    @Test
    @TestMetadata("inLocalClass.kt")
    public void testInLocalClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inLocalClass.kt");
    }

    @Test
    @TestMetadata("inOtherFile.kt")
    public void testInOtherFile() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/inOtherFile.kt");
    }

    @Test
    @TestMetadata("intersectionOverride.kt")
    public void testIntersectionOverride() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride.kt");
    }

    @Test
    @TestMetadata("intersectionOverride2.kt")
    public void testIntersectionOverride2() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/intersectionOverride2.kt");
    }

    @Test
    @TestMetadata("javaAccessors.kt")
    public void testJavaAccessors() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/javaAccessors.kt");
    }

    @Test
    @TestMetadata("multipleInterfaces.kt")
    public void testMultipleInterfaces() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/multipleInterfaces.kt");
    }

    @Test
    @TestMetadata("onEnumEntry.kt")
    public void testOnEnumEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/onEnumEntry.kt");
    }

    @Test
    @TestMetadata("sequenceOfOverrides.kt")
    public void testSequenceOfOverrides() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolDeclarationOverridesProvider/overriddenSymbols/sequenceOfOverrides.kt");
    }
}
