/*
 * Copyright (C) 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.dfmetrics.model;

import com.google.auto.value.AutoValue;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Class {@link JobConfig} represents the various configurations for launching template / collecting
 * metrics.
 */
@AutoValue
public abstract class JobConfig {
  public abstract String projectId();

  public abstract String location();

  public @Nullable abstract String jobId();

  public @Nullable abstract String jobName();

  public @Nullable abstract String templateName();

  public @Nullable abstract String templateVersion();

  public @Nullable abstract String templateType();

  public @Nullable abstract String templateSpec();

  public @Nullable abstract Integer timeoutInMinutes();

  public @Nullable abstract Map<String, String> pipelineOptions();

  public @Nullable abstract Map<String, Object> environmentOptions();

  public @Nullable abstract ResourcePricing resourcePricing();

  public static Builder builder() {
    return new AutoValue_JobConfig.Builder();
  }

  /** Builder for {@link JobConfig}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setProjectId(String value);

    public abstract Builder setLocation(String value);

    public abstract Builder setJobId(String value);

    public abstract Builder setJobName(String value);

    public abstract Builder setTemplateName(String value);

    public abstract Builder setTemplateVersion(String value);

    public abstract Builder setTemplateType(String value);

    public abstract Builder setTemplateSpec(String value);

    public abstract Builder setTimeoutInMinutes(Integer value);

    public abstract Builder setPipelineOptions(Map<String, String> value);

    public abstract Builder setEnvironmentOptions(Map<String, Object> value);

    public abstract Builder setResourcePricing(ResourcePricing value);

    public abstract JobConfig build();
  }
}
