@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        buildType: "deploy",
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-triton",
            tokenId: "sonarcloud-token-kura-triton",
            exclusions: "tests/**/*,**/*.xml,**/*.yml",
            testExclusions: "**/*"
        ],
    )
}
