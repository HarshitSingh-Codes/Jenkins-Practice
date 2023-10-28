pipelineJob('dsl-pipeline') {
  definition {
    cps {
      script(readFileFromWorkspace('jenkinsfile'))
      sandbox()     
    }
  }
}
// client ID
// 595817032397-hdq2jfg14rdf85d563kr9lveqripf1ip.apps.googleusercontent.com
// client secret
// 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