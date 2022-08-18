/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.java;

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
@TestMetadata("compiler/fir/analysis-tests/testData/lightClasses")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirOldFrontendLightClassesTestGenerated extends AbstractFirOldFrontendLightClassesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLightClasses() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/analysis-tests/testData/lightClasses"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("genericClasses.kt")
    public void testGenericClasses() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/lightClasses/genericClasses.kt");
    }

    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/lightClasses/nestedClasses.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/lightClasses/simple.kt");
    }

    @TestMetadata("typeMapping.kt")
    public void testTypeMapping() throws Exception {
        runTest("compiler/fir/analysis-tests/testData/lightClasses/typeMapping.kt");
    }
}
