plugins {
	id("jadx-library")
}

dependencies {
	api(project(":jadx-core"))

	// show bytecode disassemble
	implementation("io.github.skylot:raung-disasm:0.1.1")
	implementation("io.github.yricky.oh:abcde-jvm:0.1.0-main-b8d190b")

	testImplementation(project(":jadx-core"))
}
