job('dsl-child-job-01') {
  steps {
    shell('echo -e "$JOB_NAME is running... \n Buid No.- $BUILD_NUMBER"')
  }
}
job('dsl-child-job-02') {
  steps {
    shell('echo -e "$JOB_NAME is running... \n Buid No.- $BUILD_NUMBER"')
  }
}
job('dev-child-job-03') {
  steps {
    shell('echo -e "$JOB_NAME is running... \n Buid No.- $BUILD_NUMBER"')
  }
}