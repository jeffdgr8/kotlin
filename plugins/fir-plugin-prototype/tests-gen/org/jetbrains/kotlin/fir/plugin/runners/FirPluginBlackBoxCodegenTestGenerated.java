/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/fir-plugin-prototype/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class FirPluginBlackBoxCodegenTestGenerated extends AbstractFirPluginBlackBoxCodegenTest {
    @Test
    public void testAllFilesPresentInBox() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir-plugin-prototype/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @Test
    @TestMetadata("classWithCompanionObject.kt")
    public void testClassWithCompanionObject() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/classWithCompanionObject.kt");
    }

    @Test
    @TestMetadata("classWithGeneratedMembersAndNestedClass.kt")
    public void testClassWithGeneratedMembersAndNestedClass() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/classWithGeneratedMembersAndNestedClass.kt");
    }

    @Test
    @TestMetadata("generatedClassWithMembersAndNestedClasses.kt")
    public void testGeneratedClassWithMembersAndNestedClasses() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/generatedClassWithMembersAndNestedClasses.kt");
    }

    @Test
    @TestMetadata("newSupertype.kt")
    public void testNewSupertype() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/newSupertype.kt");
    }

    @Test
    @TestMetadata("serializer.kt")
    public void testSerializer() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/serializer.kt");
    }

    @Test
    @TestMetadata("topLevelCallables.kt")
    public void testTopLevelCallables() throws Exception {
        runTest("plugins/fir-plugin-prototype/testData/box/topLevelCallables.kt");
    }
}
