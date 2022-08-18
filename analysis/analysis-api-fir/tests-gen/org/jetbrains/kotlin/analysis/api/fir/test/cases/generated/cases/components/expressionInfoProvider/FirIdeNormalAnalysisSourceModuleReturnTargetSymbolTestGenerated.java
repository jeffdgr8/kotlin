/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.expressionInfoProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.expressionInfoProvider.AbstractReturnTargetSymbolTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleReturnTargetSymbolTestGenerated extends AbstractReturnTargetSymbolTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInReturnExpressionTargetSymbol() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("labeledReturn.kt")
    public void testLabeledReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/labeledReturn.kt");
    }

    @Test
    @TestMetadata("normalReturn.kt")
    public void testNormalReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/normalReturn.kt");
    }

    @Test
    @TestMetadata("unresolvedReturn.kt")
    public void testUnresolvedReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/unresolvedReturn.kt");
    }
}
