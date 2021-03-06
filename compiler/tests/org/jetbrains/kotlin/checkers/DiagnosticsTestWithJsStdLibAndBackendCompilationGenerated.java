/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsTestWithJsStdLibAndBackendCompilationGenerated extends AbstractDiagnosticsTestWithJsStdLibAndBackendCompilation {
    public void testAllFilesPresentInTestsWithJsStdLibAndBackendCompilation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Inline extends AbstractDiagnosticsTestWithJsStdLibAndBackendCompilation {
        public void testAllFilesPresentInInline() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("recursionCycle.kt")
        public void testRecursionCycle() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycle.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleLambda.kt")
        public void testRecursionCycleLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleWithPublicFun.kt")
        public void testRecursionCycleWithPublicFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithPublicFun.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleWithStdlibCall.kt")
        public void testRecursionCycleWithStdlibCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithStdlibCall.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UnsupportedFeatures extends AbstractDiagnosticsTestWithJsStdLibAndBackendCompilation {
        public void testAllFilesPresentInUnsupportedFeatures() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("annotations.kt")
        public void testAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/unsupportedFeatures/annotations.kt");
            doTest(fileName);
        }
    }
}
