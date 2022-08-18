/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.builder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/raw-fir/psi2fir/testData/sourceElementMapping")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class RawFirBuilderSourceElementMappingTestCaseGenerated extends AbstractRawFirBuilderSourceElementMappingTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doRawFirTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSourceElementMapping() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/sourceElementMapping"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("qualifiedExpression.kt")
    public void testQualifiedExpression() throws Exception {
        runTest("compiler/fir/raw-fir/psi2fir/testData/sourceElementMapping/qualifiedExpression.kt");
    }
}
