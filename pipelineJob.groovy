pipelineJob('dsl-pipeline') {
  definition {
    cps {
      script(readFileFromWorkspace('jenkinsfile'))
      sandbox()     
    }
  }
}