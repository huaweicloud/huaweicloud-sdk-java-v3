package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.AddRdsNoAgentDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchAddResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteAuditScopeRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteAuditScopeResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchDeleteResourceTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.BatchSetAuditAlarmLogStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.BatchSetAuditAlarmLogStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.BindDbEncryptEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.BindDbEncryptEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.BindDbOmEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.BindDbOmEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbEncryptSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbEncryptSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbOmSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.ChangeDbOmSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.ConfirmUpgradeAuditRequest;
import com.huaweicloud.sdk.dbss.v1.model.ConfirmUpgradeAuditResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountDbAccountSessionRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountDbAccountSessionResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountDbClientSessionRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountDbClientSessionResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountInjectionStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountInjectionStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountOperationStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountOperationStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountRiskTrendStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountRiskTrendStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSessionStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSessionStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlTrendStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.CountSqlTrendStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditDbAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditDbAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditScopeRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditScopeRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditSqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateAuditSqlRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbEncryptInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbEncryptInstancePeriodResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbOmInstancePeriodRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateDbOmInstancePeriodResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateInstancesPeriodOrderResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.CreateSensitiveMaskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.CreateSensitiveMaskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditBackupTaskRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditBackupTaskResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleSqlRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditRuleSqlResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditScopeRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditScopeResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DeleteSensitiveRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.DeleteSensitiveRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditReportRequest;
import com.huaweicloud.sdk.dbss.v1.model.DownloadAuditReportResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditAlarmLogResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupRiskTemplatesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditBackupRiskTemplatesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstanceJobsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditObsBucketsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditObsBucketsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditOperateLogsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportTemplatesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportTemplatesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditReportsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleRisksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditRuleScopesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSensitiveMasksResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSqlsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditSummaryInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTrendHistoryRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAuditTrendHistoryResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListAvailabilityZoneInfosResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListDbEncryptInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListDbEncryptInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListEcsSpecificationResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListProjectResourceTagsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListRdsDatabasesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListResourceInstanceByTagResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListSqlInjectionRulesResponse;
import com.huaweicloud.sdk.dbss.v1.model.ListWhitelistsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ListWhitelistsResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.RebootDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbEncryptPasswordRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbEncryptPasswordResponse;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbOmPasswordRequest;
import com.huaweicloud.sdk.dbss.v1.model.ResetDbOmPasswordResponse;
import com.huaweicloud.sdk.dbss.v1.model.RestoreAuditBackupRequest;
import com.huaweicloud.sdk.dbss.v1.model.RestoreAuditBackupResponse;
import com.huaweicloud.sdk.dbss.v1.model.RetryAuditBackupTaskRequest;
import com.huaweicloud.sdk.dbss.v1.model.RetryAuditBackupTaskResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAlarmTopicConfigInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAlarmLogStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAlarmLogStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAutoBackupTemplateRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditAutoBackupTemplateResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupRiskSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupRiskSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditBackupSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditInstanceTimeZoneRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditInstanceTimeZoneResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditScopeRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditScopeRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditSqlRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetAuditSqlRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskOperationPolicyRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskOperationPolicyResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskRuleRankRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetRiskRuleRankResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveMaskRuleSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveMaskRuleSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveResultSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveResultSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSensitiveSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.SetSqlRuleRankRequest;
import com.huaweicloud.sdk.dbss.v1.model.SetSqlRuleRankResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackRiskTemplateRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackRiskTemplateResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackupStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditBackupStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditRuleRiskResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditStatisticsRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditStatisticsResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTaskStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTaskStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTopicReportSchedulerConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditTopicReportSchedulerConfigResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditUpgradeStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowAuditUpgradeStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowBackupRiskBucketPathRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowBackupRiskBucketPathResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceMonitorInfoRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceMonitorInfoResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceQuotaRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowInstanceQuotaResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveMaskSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveMaskSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveResultSwitchRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSensitiveResultSwitchResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowServerVersionRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowServerVersionResponse;
import com.huaweicloud.sdk.dbss.v1.model.ShowSqlDetailRequest;
import com.huaweicloud.sdk.dbss.v1.model.ShowSqlDetailResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StartDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StartDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopDbEncryptInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopDbEncryptInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.StopDbOmInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.StopDbOmInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAgentResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchAuditDatabaseResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.SwitchRiskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbEncryptEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbEncryptEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbOmEipRequest;
import com.huaweicloud.sdk.dbss.v1.model.UnbindDbOmEipResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditInstanceResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditRiskBucketPathRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditRiskBucketPathResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditScopeRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditScopeRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupNewRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupNewResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSecurityGroupResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSqlRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditSqlRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTaskStatusRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTaskStatusResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTopicReportSchedulerConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditTopicReportSchedulerConfigResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditWhitelistRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateAuditWhitelistResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbEncryptInstanceNameRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbEncryptInstanceNameResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbOmInstanceNameRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateDbOmInstanceNameResponse;
import com.huaweicloud.sdk.dbss.v1.model.UpdateSensitiveMaskRuleRequest;
import com.huaweicloud.sdk.dbss.v1.model.UpdateSensitiveMaskRuleResponse;
import com.huaweicloud.sdk.dbss.v1.model.UploadAuditDbConfigRequest;
import com.huaweicloud.sdk.dbss.v1.model.UploadAuditDbConfigResponse;

import java.util.concurrent.CompletableFuture;

public class DbssAsyncClient {

    protected HcClient hcClient;

    public DbssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssAsyncClient> newBuilder() {
        ClientBuilder<DbssAsyncClient> clientBuilder = new ClientBuilder<>(DbssAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加审计数据库Agent[待下线]
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentRequest 请求对象
     * @return CompletableFuture<AddAuditAgentResponse>
     */
    @Deprecated
    public CompletableFuture<AddAuditAgentResponse> addAuditAgentAsync(AddAuditAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addAuditAgent);
    }

    /**
     * 添加审计数据库Agent[待下线]
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentRequest 请求对象
     * @return AsyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse>
     */
    @Deprecated
    public AsyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse> addAuditAgentAsyncInvoker(
        AddAuditAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addAuditAgent, hcClient);
    }

    /**
     * 添加自建数据库[待下线]
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return CompletableFuture<AddAuditDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<AddAuditDatabaseResponse> addAuditDatabaseAsync(AddAuditDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addAuditDatabase);
    }

    /**
     * 添加自建数据库[待下线]
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return AsyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse> addAuditDatabaseAsyncInvoker(
        AddAuditDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addAuditDatabase, hcClient);
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseNewRequest 请求对象
     * @return CompletableFuture<AddAuditDatabaseNewResponse>
     */
    public CompletableFuture<AddAuditDatabaseNewResponse> addAuditDatabaseNewAsync(AddAuditDatabaseNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addAuditDatabaseNew);
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseNewRequest 请求对象
     * @return AsyncInvoker<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse>
     */
    public AsyncInvoker<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse> addAuditDatabaseNewAsyncInvoker(
        AddAuditDatabaseNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addAuditDatabaseNew, hcClient);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return CompletableFuture<AddRdsDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<AddRdsDatabaseResponse> addRdsDatabaseAsync(AddRdsDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addRdsDatabase);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return AsyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse> addRdsDatabaseAsyncInvoker(
        AddRdsDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addRdsDatabase, hcClient);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseNewRequest 请求对象
     * @return CompletableFuture<AddRdsDatabaseNewResponse>
     */
    public CompletableFuture<AddRdsDatabaseNewResponse> addRdsDatabaseNewAsync(AddRdsDatabaseNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addRdsDatabaseNew);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseNewRequest 请求对象
     * @return AsyncInvoker<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse>
     */
    public AsyncInvoker<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse> addRdsDatabaseNewAsyncInvoker(
        AddRdsDatabaseNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addRdsDatabaseNew, hcClient);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库。V1版本已不再维护，待下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return CompletableFuture<AddRdsNoAgentDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseAsync(
        AddRdsNoAgentDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addRdsNoAgentDatabase);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库。V1版本已不再维护，待下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return AsyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseAsyncInvoker(
        AddRdsNoAgentDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addRdsNoAgentDatabase, hcClient);
    }

    /**
     * 审计范围规则操作-删除策略
     *
     * 审计范围规则操作-删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAuditScopeRequest 请求对象
     * @return CompletableFuture<BatchDeleteAuditScopeResponse>
     */
    public CompletableFuture<BatchDeleteAuditScopeResponse> batchDeleteAuditScopeAsync(
        BatchDeleteAuditScopeRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchDeleteAuditScope);
    }

    /**
     * 审计范围规则操作-删除策略
     *
     * 审计范围规则操作-删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAuditScopeRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse>
     */
    public AsyncInvoker<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse> batchDeleteAuditScopeAsyncInvoker(
        BatchDeleteAuditScopeRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchDeleteAuditScope, hcClient);
    }

    /**
     * 批量标记
     *
     * 批量标记
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAuditAlarmLogStatusRequest 请求对象
     * @return CompletableFuture<BatchSetAuditAlarmLogStatusResponse>
     */
    public CompletableFuture<BatchSetAuditAlarmLogStatusResponse> batchSetAuditAlarmLogStatusAsync(
        BatchSetAuditAlarmLogStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchSetAuditAlarmLogStatus);
    }

    /**
     * 批量标记
     *
     * 批量标记
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAuditAlarmLogStatusRequest 请求对象
     * @return AsyncInvoker<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse>
     */
    public AsyncInvoker<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse> batchSetAuditAlarmLogStatusAsyncInvoker(
        BatchSetAuditAlarmLogStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchSetAuditAlarmLogStatus, hcClient);
    }

    /**
     * 绑定数据库加密实例的eip
     *
     * 绑定数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbEncryptEipRequest 请求对象
     * @return CompletableFuture<BindDbEncryptEipResponse>
     */
    public CompletableFuture<BindDbEncryptEipResponse> bindDbEncryptEipAsync(BindDbEncryptEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.bindDbEncryptEip);
    }

    /**
     * 绑定数据库加密实例的eip
     *
     * 绑定数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbEncryptEipRequest 请求对象
     * @return AsyncInvoker<BindDbEncryptEipRequest, BindDbEncryptEipResponse>
     */
    public AsyncInvoker<BindDbEncryptEipRequest, BindDbEncryptEipResponse> bindDbEncryptEipAsyncInvoker(
        BindDbEncryptEipRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.bindDbEncryptEip, hcClient);
    }

    /**
     * 绑定数据库运维实例的eip
     *
     * 绑定数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbOmEipRequest 请求对象
     * @return CompletableFuture<BindDbOmEipResponse>
     */
    public CompletableFuture<BindDbOmEipResponse> bindDbOmEipAsync(BindDbOmEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.bindDbOmEip);
    }

    /**
     * 绑定数据库运维实例的eip
     *
     * 绑定数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbOmEipRequest 请求对象
     * @return AsyncInvoker<BindDbOmEipRequest, BindDbOmEipResponse>
     */
    public AsyncInvoker<BindDbOmEipRequest, BindDbOmEipResponse> bindDbOmEipAsyncInvoker(BindDbOmEipRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.bindDbOmEip, hcClient);
    }

    /**
     * 更改数据库加密实例的安全组
     *
     * 更改数据库加密实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbEncryptSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeDbEncryptSecurityGroupResponse>
     */
    public CompletableFuture<ChangeDbEncryptSecurityGroupResponse> changeDbEncryptSecurityGroupAsync(
        ChangeDbEncryptSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.changeDbEncryptSecurityGroup);
    }

    /**
     * 更改数据库加密实例的安全组
     *
     * 更改数据库加密实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbEncryptSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse> changeDbEncryptSecurityGroupAsyncInvoker(
        ChangeDbEncryptSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.changeDbEncryptSecurityGroup, hcClient);
    }

    /**
     * 更改数据库运维实例的安全组
     *
     * 更改数据库运维实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbOmSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeDbOmSecurityGroupResponse>
     */
    public CompletableFuture<ChangeDbOmSecurityGroupResponse> changeDbOmSecurityGroupAsync(
        ChangeDbOmSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.changeDbOmSecurityGroup);
    }

    /**
     * 更改数据库运维实例的安全组
     *
     * 更改数据库运维实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbOmSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse> changeDbOmSecurityGroupAsyncInvoker(
        ChangeDbOmSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.changeDbOmSecurityGroup, hcClient);
    }

    /**
     * 触发审计实例升级
     *
     * 触发审计实例升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUpgradeAuditRequest 请求对象
     * @return CompletableFuture<ConfirmUpgradeAuditResponse>
     */
    public CompletableFuture<ConfirmUpgradeAuditResponse> confirmUpgradeAuditAsync(ConfirmUpgradeAuditRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.confirmUpgradeAudit);
    }

    /**
     * 触发审计实例升级
     *
     * 触发审计实例升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUpgradeAuditRequest 请求对象
     * @return AsyncInvoker<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse>
     */
    public AsyncInvoker<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse> confirmUpgradeAuditAsyncInvoker(
        ConfirmUpgradeAuditRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.confirmUpgradeAudit, hcClient);
    }

    /**
     * 查询数据库用户会话分布
     *
     * 查询数据库用户会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbAccountSessionRequest 请求对象
     * @return CompletableFuture<CountDbAccountSessionResponse>
     */
    public CompletableFuture<CountDbAccountSessionResponse> countDbAccountSessionAsync(
        CountDbAccountSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countDbAccountSession);
    }

    /**
     * 查询数据库用户会话分布
     *
     * 查询数据库用户会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbAccountSessionRequest 请求对象
     * @return AsyncInvoker<CountDbAccountSessionRequest, CountDbAccountSessionResponse>
     */
    public AsyncInvoker<CountDbAccountSessionRequest, CountDbAccountSessionResponse> countDbAccountSessionAsyncInvoker(
        CountDbAccountSessionRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countDbAccountSession, hcClient);
    }

    /**
     * 查询客户端会话分布
     *
     * 查询客户端会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbClientSessionRequest 请求对象
     * @return CompletableFuture<CountDbClientSessionResponse>
     */
    public CompletableFuture<CountDbClientSessionResponse> countDbClientSessionAsync(
        CountDbClientSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countDbClientSession);
    }

    /**
     * 查询客户端会话分布
     *
     * 查询客户端会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbClientSessionRequest 请求对象
     * @return AsyncInvoker<CountDbClientSessionRequest, CountDbClientSessionResponse>
     */
    public AsyncInvoker<CountDbClientSessionRequest, CountDbClientSessionResponse> countDbClientSessionAsyncInvoker(
        CountDbClientSessionRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countDbClientSession, hcClient);
    }

    /**
     * 获取指定时间段内的sql注入分布统计
     *
     * 获取指定时间段内的sql注入分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInjectionStatisticsRequest 请求对象
     * @return CompletableFuture<CountInjectionStatisticsResponse>
     */
    public CompletableFuture<CountInjectionStatisticsResponse> countInjectionStatisticsAsync(
        CountInjectionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countInjectionStatistics);
    }

    /**
     * 获取指定时间段内的sql注入分布统计
     *
     * 获取指定时间段内的sql注入分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInjectionStatisticsRequest 请求对象
     * @return AsyncInvoker<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse>
     */
    public AsyncInvoker<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse> countInjectionStatisticsAsyncInvoker(
        CountInjectionStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countInjectionStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的风险操作数量分布统计
     *
     * 获取指定时间段内的风险操作数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOperationStatisticsRequest 请求对象
     * @return CompletableFuture<CountOperationStatisticsResponse>
     */
    public CompletableFuture<CountOperationStatisticsResponse> countOperationStatisticsAsync(
        CountOperationStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countOperationStatistics);
    }

    /**
     * 获取指定时间段内的风险操作数量分布统计
     *
     * 获取指定时间段内的风险操作数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOperationStatisticsRequest 请求对象
     * @return AsyncInvoker<CountOperationStatisticsRequest, CountOperationStatisticsResponse>
     */
    public AsyncInvoker<CountOperationStatisticsRequest, CountOperationStatisticsResponse> countOperationStatisticsAsyncInvoker(
        CountOperationStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countOperationStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的风险分布统计
     *
     * 获取指定时间段内的风险分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountRiskTrendStatisticsRequest 请求对象
     * @return CompletableFuture<CountRiskTrendStatisticsResponse>
     */
    public CompletableFuture<CountRiskTrendStatisticsResponse> countRiskTrendStatisticsAsync(
        CountRiskTrendStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countRiskTrendStatistics);
    }

    /**
     * 获取指定时间段内的风险分布统计
     *
     * 获取指定时间段内的风险分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountRiskTrendStatisticsRequest 请求对象
     * @return AsyncInvoker<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse>
     */
    public AsyncInvoker<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse> countRiskTrendStatisticsAsyncInvoker(
        CountRiskTrendStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countRiskTrendStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的查询会话统计
     *
     * 获取指定时间段内的查询会话统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSessionStatisticsRequest 请求对象
     * @return CompletableFuture<CountSessionStatisticsResponse>
     */
    public CompletableFuture<CountSessionStatisticsResponse> countSessionStatisticsAsync(
        CountSessionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countSessionStatistics);
    }

    /**
     * 获取指定时间段内的查询会话统计
     *
     * 获取指定时间段内的查询会话统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSessionStatisticsRequest 请求对象
     * @return AsyncInvoker<CountSessionStatisticsRequest, CountSessionStatisticsResponse>
     */
    public AsyncInvoker<CountSessionStatisticsRequest, CountSessionStatisticsResponse> countSessionStatisticsAsyncInvoker(
        CountSessionStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countSessionStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的SQL分布统计
     *
     * 获取指定时间段内的SQL分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlStatisticsRequest 请求对象
     * @return CompletableFuture<CountSqlStatisticsResponse>
     */
    public CompletableFuture<CountSqlStatisticsResponse> countSqlStatisticsAsync(CountSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countSqlStatistics);
    }

    /**
     * 获取指定时间段内的SQL分布统计
     *
     * 获取指定时间段内的SQL分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<CountSqlStatisticsRequest, CountSqlStatisticsResponse>
     */
    public AsyncInvoker<CountSqlStatisticsRequest, CountSqlStatisticsResponse> countSqlStatisticsAsyncInvoker(
        CountSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countSqlStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的sql数量分布统计
     *
     * 获取指定时间段内的sql数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlTrendStatisticsRequest 请求对象
     * @return CompletableFuture<CountSqlTrendStatisticsResponse>
     */
    public CompletableFuture<CountSqlTrendStatisticsResponse> countSqlTrendStatisticsAsync(
        CountSqlTrendStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countSqlTrendStatistics);
    }

    /**
     * 获取指定时间段内的sql数量分布统计
     *
     * 获取指定时间段内的sql数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlTrendStatisticsRequest 请求对象
     * @return AsyncInvoker<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse>
     */
    public AsyncInvoker<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse> countSqlTrendStatisticsAsyncInvoker(
        CountSqlTrendStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countSqlTrendStatistics, hcClient);
    }

    /**
     * 添加风险规则
     *
     * 添加风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditRiskRuleRequest 请求对象
     * @return CompletableFuture<CreateAuditRiskRuleResponse>
     */
    public CompletableFuture<CreateAuditRiskRuleResponse> createAuditRiskRuleAsync(CreateAuditRiskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createAuditRiskRule);
    }

    /**
     * 添加风险规则
     *
     * 添加风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditRiskRuleRequest 请求对象
     * @return AsyncInvoker<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse>
     */
    public AsyncInvoker<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse> createAuditRiskRuleAsyncInvoker(
        CreateAuditRiskRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createAuditRiskRule, hcClient);
    }

    /**
     * 添加审计范围策略
     *
     * 添加审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditScopeRuleRequest 请求对象
     * @return CompletableFuture<CreateAuditScopeRuleResponse>
     */
    public CompletableFuture<CreateAuditScopeRuleResponse> createAuditScopeRuleAsync(
        CreateAuditScopeRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createAuditScopeRule);
    }

    /**
     * 添加审计范围策略
     *
     * 添加审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditScopeRuleRequest 请求对象
     * @return AsyncInvoker<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse>
     */
    public AsyncInvoker<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse> createAuditScopeRuleAsyncInvoker(
        CreateAuditScopeRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createAuditScopeRule, hcClient);
    }

    /**
     * 按包周期方式购买数据库加密实例
     *
     * 按需方式购买数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbEncryptInstancePeriodRequest 请求对象
     * @return CompletableFuture<CreateDbEncryptInstancePeriodResponse>
     */
    public CompletableFuture<CreateDbEncryptInstancePeriodResponse> createDbEncryptInstancePeriodAsync(
        CreateDbEncryptInstancePeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createDbEncryptInstancePeriod);
    }

    /**
     * 按包周期方式购买数据库加密实例
     *
     * 按需方式购买数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbEncryptInstancePeriodRequest 请求对象
     * @return AsyncInvoker<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse>
     */
    public AsyncInvoker<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse> createDbEncryptInstancePeriodAsyncInvoker(
        CreateDbEncryptInstancePeriodRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createDbEncryptInstancePeriod, hcClient);
    }

    /**
     * 包周期购买数据库运维实例
     *
     * 包周期购买数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbOmInstancePeriodRequest 请求对象
     * @return CompletableFuture<CreateDbOmInstancePeriodResponse>
     */
    public CompletableFuture<CreateDbOmInstancePeriodResponse> createDbOmInstancePeriodAsync(
        CreateDbOmInstancePeriodRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createDbOmInstancePeriod);
    }

    /**
     * 包周期购买数据库运维实例
     *
     * 包周期购买数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbOmInstancePeriodRequest 请求对象
     * @return AsyncInvoker<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse>
     */
    public AsyncInvoker<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse> createDbOmInstancePeriodAsyncInvoker(
        CreateDbOmInstancePeriodRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createDbOmInstancePeriod, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例[待下线]
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return CompletableFuture<CreateInstancesPeriodOrderResponse>
     */
    @Deprecated
    public CompletableFuture<CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderAsync(
        CreateInstancesPeriodOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createInstancesPeriodOrder);
    }

    /**
     * 包年包月计费模式创建审计实例[待下线]
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return AsyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderAsyncInvoker(
        CreateInstancesPeriodOrderRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createInstancesPeriodOrder, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderNewRequest 请求对象
     * @return CompletableFuture<CreateInstancesPeriodOrderNewResponse>
     */
    public CompletableFuture<CreateInstancesPeriodOrderNewResponse> createInstancesPeriodOrderNewAsync(
        CreateInstancesPeriodOrderNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createInstancesPeriodOrderNew);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderNewRequest 请求对象
     * @return AsyncInvoker<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse>
     */
    public AsyncInvoker<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse> createInstancesPeriodOrderNewAsyncInvoker(
        CreateInstancesPeriodOrderNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createInstancesPeriodOrderNew, hcClient);
    }

    /**
     * 立即生成报表
     *
     * 立即生成报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CompletableFuture<CreateReportResponse>
     */
    public CompletableFuture<CreateReportResponse> createReportAsync(CreateReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createReport);
    }

    /**
     * 立即生成报表
     *
     * 立即生成报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return AsyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public AsyncInvoker<CreateReportRequest, CreateReportResponse> createReportAsyncInvoker(
        CreateReportRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createReport, hcClient);
    }

    /**
     * 增加隐私数据脱敏规则
     *
     * 增加隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSensitiveMaskRuleRequest 请求对象
     * @return CompletableFuture<CreateSensitiveMaskRuleResponse>
     */
    public CompletableFuture<CreateSensitiveMaskRuleResponse> createSensitiveMaskRuleAsync(
        CreateSensitiveMaskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createSensitiveMaskRule);
    }

    /**
     * 增加隐私数据脱敏规则
     *
     * 增加隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSensitiveMaskRuleRequest 请求对象
     * @return AsyncInvoker<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse>
     */
    public AsyncInvoker<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse> createSensitiveMaskRuleAsyncInvoker(
        CreateSensitiveMaskRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createSensitiveMaskRule, hcClient);
    }

    /**
     * 删除数据库Agent[待下线]
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return CompletableFuture<DeleteAuditAgentResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteAuditAgentResponse> deleteAuditAgentAsync(DeleteAuditAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditAgent);
    }

    /**
     * 删除数据库Agent[待下线]
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return AsyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse> deleteAuditAgentAsyncInvoker(
        DeleteAuditAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditAgent, hcClient);
    }

    /**
     * 删除告警监控记录
     *
     * 删除告警监控记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAlarmLogRequest 请求对象
     * @return CompletableFuture<DeleteAuditAlarmLogResponse>
     */
    public CompletableFuture<DeleteAuditAlarmLogResponse> deleteAuditAlarmLogAsync(DeleteAuditAlarmLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditAlarmLog);
    }

    /**
     * 删除告警监控记录
     *
     * 删除告警监控记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAlarmLogRequest 请求对象
     * @return AsyncInvoker<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse>
     */
    public AsyncInvoker<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse> deleteAuditAlarmLogAsyncInvoker(
        DeleteAuditAlarmLogRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditAlarmLog, hcClient);
    }

    /**
     * 删除指定备份任务
     *
     * 删除指定备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditBackupTaskRequest 请求对象
     * @return CompletableFuture<DeleteAuditBackupTaskResponse>
     */
    public CompletableFuture<DeleteAuditBackupTaskResponse> deleteAuditBackupTaskAsync(
        DeleteAuditBackupTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditBackupTask);
    }

    /**
     * 删除指定备份任务
     *
     * 删除指定备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditBackupTaskRequest 请求对象
     * @return AsyncInvoker<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse>
     */
    public AsyncInvoker<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse> deleteAuditBackupTaskAsyncInvoker(
        DeleteAuditBackupTaskRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditBackupTask, hcClient);
    }

    /**
     * 删除数据库[待下线]
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteAuditDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteAuditDatabaseResponse> deleteAuditDatabaseAsync(DeleteAuditDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditDatabase);
    }

    /**
     * 删除数据库[待下线]
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> deleteAuditDatabaseAsyncInvoker(
        DeleteAuditDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseNewRequest 请求对象
     * @return CompletableFuture<DeleteAuditDatabaseNewResponse>
     */
    public CompletableFuture<DeleteAuditDatabaseNewResponse> deleteAuditDatabaseNewAsync(
        DeleteAuditDatabaseNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditDatabaseNew);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseNewRequest 请求对象
     * @return AsyncInvoker<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse>
     */
    public AsyncInvoker<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse> deleteAuditDatabaseNewAsyncInvoker(
        DeleteAuditDatabaseNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditDatabaseNew, hcClient);
    }

    /**
     * 删除报表
     *
     * 删除报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditReportRequest 请求对象
     * @return CompletableFuture<DeleteAuditReportResponse>
     */
    public CompletableFuture<DeleteAuditReportResponse> deleteAuditReportAsync(DeleteAuditReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditReport);
    }

    /**
     * 删除报表
     *
     * 删除报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditReportRequest 请求对象
     * @return AsyncInvoker<DeleteAuditReportRequest, DeleteAuditReportResponse>
     */
    public AsyncInvoker<DeleteAuditReportRequest, DeleteAuditReportResponse> deleteAuditReportAsyncInvoker(
        DeleteAuditReportRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditReport, hcClient);
    }

    /**
     * 删除风险策略
     *
     * 删除风险策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleRiskRequest 请求对象
     * @return CompletableFuture<DeleteAuditRuleRiskResponse>
     */
    public CompletableFuture<DeleteAuditRuleRiskResponse> deleteAuditRuleRiskAsync(DeleteAuditRuleRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditRuleRisk);
    }

    /**
     * 删除风险策略
     *
     * 删除风险策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleRiskRequest 请求对象
     * @return AsyncInvoker<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse>
     */
    public AsyncInvoker<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse> deleteAuditRuleRiskAsyncInvoker(
        DeleteAuditRuleRiskRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditRuleRisk, hcClient);
    }

    /**
     * 删除审计范围策略
     *
     * 删除审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditScopeRequest 请求对象
     * @return CompletableFuture<DeleteAuditScopeResponse>
     */
    public CompletableFuture<DeleteAuditScopeResponse> deleteAuditScopeAsync(DeleteAuditScopeRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditScope);
    }

    /**
     * 删除审计范围策略
     *
     * 删除审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditScopeRequest 请求对象
     * @return AsyncInvoker<DeleteAuditScopeRequest, DeleteAuditScopeResponse>
     */
    public AsyncInvoker<DeleteAuditScopeRequest, DeleteAuditScopeResponse> deleteAuditScopeAsyncInvoker(
        DeleteAuditScopeRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditScope, hcClient);
    }

    /**
     * 删除数据库加密实例
     *
     * 删除数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbEncryptInstanceRequest 请求对象
     * @return CompletableFuture<DeleteDbEncryptInstanceResponse>
     */
    public CompletableFuture<DeleteDbEncryptInstanceResponse> deleteDbEncryptInstanceAsync(
        DeleteDbEncryptInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteDbEncryptInstance);
    }

    /**
     * 删除数据库加密实例
     *
     * 删除数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbEncryptInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse>
     */
    public AsyncInvoker<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse> deleteDbEncryptInstanceAsyncInvoker(
        DeleteDbEncryptInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteDbEncryptInstance, hcClient);
    }

    /**
     * 删除数据库运维实例
     *
     * 删除数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbOmInstanceRequest 请求对象
     * @return CompletableFuture<DeleteDbOmInstanceResponse>
     */
    public CompletableFuture<DeleteDbOmInstanceResponse> deleteDbOmInstanceAsync(DeleteDbOmInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteDbOmInstance);
    }

    /**
     * 删除数据库运维实例
     *
     * 删除数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbOmInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse>
     */
    public AsyncInvoker<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse> deleteDbOmInstanceAsyncInvoker(
        DeleteDbOmInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteDbOmInstance, hcClient);
    }

    /**
     * 删除审计实例[待下线]
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return CompletableFuture<DeleteInstancesResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteInstancesResponse> deleteInstancesAsync(DeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteInstances);
    }

    /**
     * 删除审计实例[待下线]
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesAsyncInvoker(
        DeleteInstancesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteInstances, hcClient);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesNewRequest 请求对象
     * @return CompletableFuture<DeleteInstancesNewResponse>
     */
    public CompletableFuture<DeleteInstancesNewResponse> deleteInstancesNewAsync(DeleteInstancesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteInstancesNew);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesNewRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesNewRequest, DeleteInstancesNewResponse>
     */
    public AsyncInvoker<DeleteInstancesNewRequest, DeleteInstancesNewResponse> deleteInstancesNewAsyncInvoker(
        DeleteInstancesNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteInstancesNew, hcClient);
    }

    /**
     * 删除隐私数据脱敏规则
     *
     * 删除隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSensitiveRulesRequest 请求对象
     * @return CompletableFuture<DeleteSensitiveRulesResponse>
     */
    public CompletableFuture<DeleteSensitiveRulesResponse> deleteSensitiveRulesAsync(
        DeleteSensitiveRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteSensitiveRules);
    }

    /**
     * 删除隐私数据脱敏规则
     *
     * 删除隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSensitiveRulesRequest 请求对象
     * @return AsyncInvoker<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse>
     */
    public AsyncInvoker<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse> deleteSensitiveRulesAsyncInvoker(
        DeleteSensitiveRulesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteSensitiveRules, hcClient);
    }

    /**
     * 下载审计Agent[待下线]
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return CompletableFuture<DownloadAuditAgentResponse>
     */
    @Deprecated
    public CompletableFuture<DownloadAuditAgentResponse> downloadAuditAgentAsync(DownloadAuditAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.downloadAuditAgent);
    }

    /**
     * 下载审计Agent[待下线]
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return AsyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse>
     */
    @Deprecated
    public AsyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse> downloadAuditAgentAsyncInvoker(
        DownloadAuditAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.downloadAuditAgent, hcClient);
    }

    /**
     * 下载报表
     *
     * 下载报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditReportRequest 请求对象
     * @return CompletableFuture<DownloadAuditReportResponse>
     */
    public CompletableFuture<DownloadAuditReportResponse> downloadAuditReportAsync(DownloadAuditReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.downloadAuditReport);
    }

    /**
     * 下载报表
     *
     * 下载报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditReportRequest 请求对象
     * @return AsyncInvoker<DownloadAuditReportRequest, DownloadAuditReportResponse>
     */
    public AsyncInvoker<DownloadAuditReportRequest, DownloadAuditReportResponse> downloadAuditReportAsyncInvoker(
        DownloadAuditReportRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.downloadAuditReport, hcClient);
    }

    /**
     * 获取实例告警配置[待下线]
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return CompletableFuture<ListAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public CompletableFuture<ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfoAsync(
        ListAlarmTopicConfigInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAlarmTopicConfigInfo);
    }

    /**
     * 获取实例告警配置[待下线]
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return AsyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfoAsyncInvoker(
        ListAlarmTopicConfigInfoRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoNewRequest 请求对象
     * @return CompletableFuture<ListAlarmTopicConfigInfoNewResponse>
     */
    public CompletableFuture<ListAlarmTopicConfigInfoNewResponse> listAlarmTopicConfigInfoNewAsync(
        ListAlarmTopicConfigInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAlarmTopicConfigInfoNew);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoNewRequest 请求对象
     * @return AsyncInvoker<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse>
     */
    public AsyncInvoker<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse> listAlarmTopicConfigInfoNewAsyncInvoker(
        ListAlarmTopicConfigInfoNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAlarmTopicConfigInfoNew, hcClient);
    }

    /**
     * 查询数据库Agent列表[待下线]
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return CompletableFuture<ListAuditAgentResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditAgentResponse> listAuditAgentAsync(ListAuditAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditAgent);
    }

    /**
     * 查询数据库Agent列表[待下线]
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return AsyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse> listAuditAgentAsyncInvoker(
        ListAuditAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditAgent, hcClient);
    }

    /**
     * 查询审计告警信息[待下线]
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return CompletableFuture<ListAuditAlarmLogResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditAlarmLogResponse> listAuditAlarmLogAsync(ListAuditAlarmLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditAlarmLog);
    }

    /**
     * 查询审计告警信息[待下线]
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return AsyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> listAuditAlarmLogAsyncInvoker(
        ListAuditAlarmLogRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditAlarmLog, hcClient);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogNewRequest 请求对象
     * @return CompletableFuture<ListAuditAlarmLogNewResponse>
     */
    public CompletableFuture<ListAuditAlarmLogNewResponse> listAuditAlarmLogNewAsync(
        ListAuditAlarmLogNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditAlarmLogNew);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogNewRequest 请求对象
     * @return AsyncInvoker<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse>
     */
    public AsyncInvoker<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse> listAuditAlarmLogNewAsyncInvoker(
        ListAuditAlarmLogNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditAlarmLogNew, hcClient);
    }

    /**
     * 获取所有备份信息
     *
     * 获取所有备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupInfoRequest 请求对象
     * @return CompletableFuture<ListAuditBackupInfoResponse>
     */
    public CompletableFuture<ListAuditBackupInfoResponse> listAuditBackupInfoAsync(ListAuditBackupInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditBackupInfo);
    }

    /**
     * 获取所有备份信息
     *
     * 获取所有备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupInfoRequest 请求对象
     * @return AsyncInvoker<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse>
     */
    public AsyncInvoker<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse> listAuditBackupInfoAsyncInvoker(
        ListAuditBackupInfoRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditBackupInfo, hcClient);
    }

    /**
     * 获取风险导出配置列表
     *
     * 获取风险导出配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupRiskTemplatesRequest 请求对象
     * @return CompletableFuture<ListAuditBackupRiskTemplatesResponse>
     */
    public CompletableFuture<ListAuditBackupRiskTemplatesResponse> listAuditBackupRiskTemplatesAsync(
        ListAuditBackupRiskTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditBackupRiskTemplates);
    }

    /**
     * 获取风险导出配置列表
     *
     * 获取风险导出配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupRiskTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse>
     */
    public AsyncInvoker<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse> listAuditBackupRiskTemplatesAsyncInvoker(
        ListAuditBackupRiskTemplatesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditBackupRiskTemplates, hcClient);
    }

    /**
     * 查询数据库列表[待下线]
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuditDatabasesResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditDatabasesResponse> listAuditDatabasesAsync(ListAuditDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditDatabases);
    }

    /**
     * 查询数据库列表[待下线]
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return AsyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabasesAsyncInvoker(
        ListAuditDatabasesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditDatabases, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesNewRequest 请求对象
     * @return CompletableFuture<ListAuditDatabasesNewResponse>
     */
    public CompletableFuture<ListAuditDatabasesNewResponse> listAuditDatabasesNewAsync(
        ListAuditDatabasesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditDatabasesNew);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesNewRequest 请求对象
     * @return AsyncInvoker<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse>
     */
    public AsyncInvoker<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse> listAuditDatabasesNewAsyncInvoker(
        ListAuditDatabasesNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditDatabasesNew, hcClient);
    }

    /**
     * 查询实例创建任务信息[待下线]
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return CompletableFuture<ListAuditInstanceJobsResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditInstanceJobsResponse> listAuditInstanceJobsAsync(
        ListAuditInstanceJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstanceJobs);
    }

    /**
     * 查询实例创建任务信息[待下线]
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return AsyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobsAsyncInvoker(
        ListAuditInstanceJobsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstanceJobs, hcClient);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsNewRequest 请求对象
     * @return CompletableFuture<ListAuditInstanceJobsNewResponse>
     */
    public CompletableFuture<ListAuditInstanceJobsNewResponse> listAuditInstanceJobsNewAsync(
        ListAuditInstanceJobsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstanceJobsNew);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsNewRequest 请求对象
     * @return AsyncInvoker<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse>
     */
    public AsyncInvoker<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse> listAuditInstanceJobsNewAsyncInvoker(
        ListAuditInstanceJobsNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstanceJobsNew, hcClient);
    }

    /**
     * 查询审计实例列表[待下线]
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return CompletableFuture<ListAuditInstancesResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditInstancesResponse> listAuditInstancesAsync(ListAuditInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstances);
    }

    /**
     * 查询审计实例列表[待下线]
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return AsyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstancesAsyncInvoker(
        ListAuditInstancesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstances, hcClient);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesNewRequest 请求对象
     * @return CompletableFuture<ListAuditInstancesNewResponse>
     */
    public CompletableFuture<ListAuditInstancesNewResponse> listAuditInstancesNewAsync(
        ListAuditInstancesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditInstancesNew);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesNewRequest 请求对象
     * @return AsyncInvoker<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse>
     */
    public AsyncInvoker<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse> listAuditInstancesNewAsyncInvoker(
        ListAuditInstancesNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditInstancesNew, hcClient);
    }

    /**
     * 备份或风险导出时，选择obs桶
     *
     * 备份或风险导出时，选择obs桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditObsBucketsRequest 请求对象
     * @return CompletableFuture<ListAuditObsBucketsResponse>
     */
    public CompletableFuture<ListAuditObsBucketsResponse> listAuditObsBucketsAsync(ListAuditObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditObsBuckets);
    }

    /**
     * 备份或风险导出时，选择obs桶
     *
     * 备份或风险导出时，选择obs桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse>
     */
    public AsyncInvoker<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse> listAuditObsBucketsAsyncInvoker(
        ListAuditObsBucketsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditObsBuckets, hcClient);
    }

    /**
     * 查询用户操作日志信息[待下线]
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return CompletableFuture<ListAuditOperateLogsResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditOperateLogsResponse> listAuditOperateLogsAsync(
        ListAuditOperateLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditOperateLogs);
    }

    /**
     * 查询用户操作日志信息[待下线]
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return AsyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogsAsyncInvoker(
        ListAuditOperateLogsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditOperateLogs, hcClient);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsNewRequest 请求对象
     * @return CompletableFuture<ListAuditOperateLogsNewResponse>
     */
    public CompletableFuture<ListAuditOperateLogsNewResponse> listAuditOperateLogsNewAsync(
        ListAuditOperateLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditOperateLogsNew);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsNewRequest 请求对象
     * @return AsyncInvoker<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse>
     */
    public AsyncInvoker<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse> listAuditOperateLogsNewAsyncInvoker(
        ListAuditOperateLogsNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditOperateLogsNew, hcClient);
    }

    /**
     * 获取报表模板
     *
     * 获取报表模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportTemplatesRequest 请求对象
     * @return CompletableFuture<ListAuditReportTemplatesResponse>
     */
    public CompletableFuture<ListAuditReportTemplatesResponse> listAuditReportTemplatesAsync(
        ListAuditReportTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditReportTemplates);
    }

    /**
     * 获取报表模板
     *
     * 获取报表模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse>
     */
    public AsyncInvoker<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse> listAuditReportTemplatesAsyncInvoker(
        ListAuditReportTemplatesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditReportTemplates, hcClient);
    }

    /**
     * 查询报表
     *
     * 查询报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportsRequest 请求对象
     * @return CompletableFuture<ListAuditReportsResponse>
     */
    public CompletableFuture<ListAuditReportsResponse> listAuditReportsAsync(ListAuditReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditReports);
    }

    /**
     * 查询报表
     *
     * 查询报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportsRequest 请求对象
     * @return AsyncInvoker<ListAuditReportsRequest, ListAuditReportsResponse>
     */
    public AsyncInvoker<ListAuditReportsRequest, ListAuditReportsResponse> listAuditReportsAsyncInvoker(
        ListAuditReportsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditReports, hcClient);
    }

    /**
     * 查询风险规则策略[待下线]
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return CompletableFuture<ListAuditRuleRisksResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditRuleRisksResponse> listAuditRuleRisksAsync(ListAuditRuleRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleRisks);
    }

    /**
     * 查询风险规则策略[待下线]
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisksAsyncInvoker(
        ListAuditRuleRisksRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleRisks, hcClient);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksNewRequest 请求对象
     * @return CompletableFuture<ListAuditRuleRisksNewResponse>
     */
    public CompletableFuture<ListAuditRuleRisksNewResponse> listAuditRuleRisksNewAsync(
        ListAuditRuleRisksNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleRisksNew);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksNewRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse>
     */
    public AsyncInvoker<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse> listAuditRuleRisksNewAsyncInvoker(
        ListAuditRuleRisksNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleRisksNew, hcClient);
    }

    /**
     * 查询审计范围策略列表[待下线]
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return CompletableFuture<ListAuditRuleScopesResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditRuleScopesResponse> listAuditRuleScopesAsync(ListAuditRuleScopesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleScopes);
    }

    /**
     * 查询审计范围策略列表[待下线]
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopesAsyncInvoker(
        ListAuditRuleScopesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleScopes, hcClient);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesNewRequest 请求对象
     * @return CompletableFuture<ListAuditRuleScopesNewResponse>
     */
    public CompletableFuture<ListAuditRuleScopesNewResponse> listAuditRuleScopesNewAsync(
        ListAuditRuleScopesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditRuleScopesNew);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesNewRequest 请求对象
     * @return AsyncInvoker<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse>
     */
    public AsyncInvoker<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse> listAuditRuleScopesNewAsyncInvoker(
        ListAuditRuleScopesNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditRuleScopesNew, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则[待下线]
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return CompletableFuture<ListAuditSensitiveMasksResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditSensitiveMasksResponse> listAuditSensitiveMasksAsync(
        ListAuditSensitiveMasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSensitiveMasks);
    }

    /**
     * 查询隐私数据脱敏规则[待下线]
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return AsyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasksAsyncInvoker(
        ListAuditSensitiveMasksRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSensitiveMasks, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksNewRequest 请求对象
     * @return CompletableFuture<ListAuditSensitiveMasksNewResponse>
     */
    public CompletableFuture<ListAuditSensitiveMasksNewResponse> listAuditSensitiveMasksNewAsync(
        ListAuditSensitiveMasksNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSensitiveMasksNew);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksNewRequest 请求对象
     * @return AsyncInvoker<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse>
     */
    public AsyncInvoker<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse> listAuditSensitiveMasksNewAsyncInvoker(
        ListAuditSensitiveMasksNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSensitiveMasksNew, hcClient);
    }

    /**
     * 查询审计SQL语句[待下线]
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return CompletableFuture<ListAuditSqlsResponse>
     */
    @Deprecated
    public CompletableFuture<ListAuditSqlsResponse> listAuditSqlsAsync(ListAuditSqlsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSqls);
    }

    /**
     * 查询审计SQL语句[待下线]
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return AsyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse> listAuditSqlsAsyncInvoker(
        ListAuditSqlsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSqls, hcClient);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsNewRequest 请求对象
     * @return CompletableFuture<ListAuditSqlsNewResponse>
     */
    public CompletableFuture<ListAuditSqlsNewResponse> listAuditSqlsNewAsync(ListAuditSqlsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSqlsNew);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsNewRequest 请求对象
     * @return AsyncInvoker<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse>
     */
    public AsyncInvoker<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse> listAuditSqlsNewAsyncInvoker(
        ListAuditSqlsNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSqlsNew, hcClient);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return CompletableFuture<ListAuditSummaryInfosResponse>
     */
    public CompletableFuture<ListAuditSummaryInfosResponse> listAuditSummaryInfosAsync(
        ListAuditSummaryInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditSummaryInfos);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return AsyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse>
     */
    public AsyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> listAuditSummaryInfosAsyncInvoker(
        ListAuditSummaryInfosRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditSummaryInfos, hcClient);
    }

    /**
     * 查询趋势历史数据
     *
     * 查询趋势历史数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTrendHistoryRequest 请求对象
     * @return CompletableFuture<ListAuditTrendHistoryResponse>
     */
    public CompletableFuture<ListAuditTrendHistoryResponse> listAuditTrendHistoryAsync(
        ListAuditTrendHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditTrendHistory);
    }

    /**
     * 查询趋势历史数据
     *
     * 查询趋势历史数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTrendHistoryRequest 请求对象
     * @return AsyncInvoker<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse>
     */
    public AsyncInvoker<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse> listAuditTrendHistoryAsyncInvoker(
        ListAuditTrendHistoryRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditTrendHistory, hcClient);
    }

    /**
     * 查询可用区信息[待下线]
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneInfosResponse>
     */
    @Deprecated
    public CompletableFuture<ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosAsync(
        ListAvailabilityZoneInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfos);
    }

    /**
     * 查询可用区信息[待下线]
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>
     */
    @Deprecated
    public AsyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosAsyncInvoker(
        ListAvailabilityZoneInfosRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfos, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosNewRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneInfosNewResponse>
     */
    public CompletableFuture<ListAvailabilityZoneInfosNewResponse> listAvailabilityZoneInfosNewAsync(
        ListAvailabilityZoneInfosNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfosNew);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosNewRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse>
     */
    public AsyncInvoker<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse> listAvailabilityZoneInfosNewAsyncInvoker(
        ListAvailabilityZoneInfosNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfosNew, hcClient);
    }

    /**
     * 列举数据库加密实例
     *
     * 列举数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbEncryptInstancesRequest 请求对象
     * @return CompletableFuture<ListDbEncryptInstancesResponse>
     */
    public CompletableFuture<ListDbEncryptInstancesResponse> listDbEncryptInstancesAsync(
        ListDbEncryptInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listDbEncryptInstances);
    }

    /**
     * 列举数据库加密实例
     *
     * 列举数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbEncryptInstancesRequest 请求对象
     * @return AsyncInvoker<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse>
     */
    public AsyncInvoker<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse> listDbEncryptInstancesAsyncInvoker(
        ListDbEncryptInstancesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listDbEncryptInstances, hcClient);
    }

    /**
     * 查询ECS服务器规格信息[待下线]
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return CompletableFuture<ListEcsSpecificationResponse>
     */
    @Deprecated
    public CompletableFuture<ListEcsSpecificationResponse> listEcsSpecificationAsync(
        ListEcsSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listEcsSpecification);
    }

    /**
     * 查询ECS服务器规格信息[待下线]
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return AsyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>
     */
    @Deprecated
    public AsyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecificationAsyncInvoker(
        ListEcsSpecificationRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listEcsSpecification, hcClient);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationNewRequest 请求对象
     * @return CompletableFuture<ListEcsSpecificationNewResponse>
     */
    public CompletableFuture<ListEcsSpecificationNewResponse> listEcsSpecificationNewAsync(
        ListEcsSpecificationNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listEcsSpecificationNew);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationNewRequest 请求对象
     * @return AsyncInvoker<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse>
     */
    public AsyncInvoker<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse> listEcsSpecificationNewAsyncInvoker(
        ListEcsSpecificationNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listEcsSpecificationNew, hcClient);
    }

    /**
     * 获取数据库运维集群实例
     *
     * 获取数据库运维集群实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listInstances);
    }

    /**
     * 获取数据库运维集群实例
     *
     * 获取数据库运维集群实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listInstances, hcClient);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return CompletableFuture<ListRdsDatabasesResponse>
     */
    public CompletableFuture<ListRdsDatabasesResponse> listRdsDatabasesAsync(ListRdsDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listRdsDatabases);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return AsyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse>
     */
    public AsyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse> listRdsDatabasesAsyncInvoker(
        ListRdsDatabasesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listRdsDatabases, hcClient);
    }

    /**
     * 查询SQL注入规则策略[待下线]
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return CompletableFuture<ListSqlInjectionRulesResponse>
     */
    @Deprecated
    public CompletableFuture<ListSqlInjectionRulesResponse> listSqlInjectionRulesAsync(
        ListSqlInjectionRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listSqlInjectionRules);
    }

    /**
     * 查询SQL注入规则策略[待下线]
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRulesAsyncInvoker(
        ListSqlInjectionRulesRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listSqlInjectionRules, hcClient);
    }

    /**
     * 重启审计实例[待下线]
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return CompletableFuture<RebootAuditInstanceResponse>
     */
    @Deprecated
    public CompletableFuture<RebootAuditInstanceResponse> rebootAuditInstanceAsync(RebootAuditInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.rebootAuditInstance);
    }

    /**
     * 重启审计实例[待下线]
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return AsyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse>
     */
    @Deprecated
    public AsyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse> rebootAuditInstanceAsyncInvoker(
        RebootAuditInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.rebootAuditInstance, hcClient);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceNewRequest 请求对象
     * @return CompletableFuture<RebootAuditInstanceNewResponse>
     */
    public CompletableFuture<RebootAuditInstanceNewResponse> rebootAuditInstanceNewAsync(
        RebootAuditInstanceNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.rebootAuditInstanceNew);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceNewRequest 请求对象
     * @return AsyncInvoker<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse>
     */
    public AsyncInvoker<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse> rebootAuditInstanceNewAsyncInvoker(
        RebootAuditInstanceNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.rebootAuditInstanceNew, hcClient);
    }

    /**
     * 重启数据库加密实例
     *
     * 重启数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbEncryptInstanceRequest 请求对象
     * @return CompletableFuture<RebootDbEncryptInstanceResponse>
     */
    public CompletableFuture<RebootDbEncryptInstanceResponse> rebootDbEncryptInstanceAsync(
        RebootDbEncryptInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.rebootDbEncryptInstance);
    }

    /**
     * 重启数据库加密实例
     *
     * 重启数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbEncryptInstanceRequest 请求对象
     * @return AsyncInvoker<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse>
     */
    public AsyncInvoker<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse> rebootDbEncryptInstanceAsyncInvoker(
        RebootDbEncryptInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.rebootDbEncryptInstance, hcClient);
    }

    /**
     * 重启数据库运维实例
     *
     * 重启数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbOmInstanceRequest 请求对象
     * @return CompletableFuture<RebootDbOmInstanceResponse>
     */
    public CompletableFuture<RebootDbOmInstanceResponse> rebootDbOmInstanceAsync(RebootDbOmInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.rebootDbOmInstance);
    }

    /**
     * 重启数据库运维实例
     *
     * 重启数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbOmInstanceRequest 请求对象
     * @return AsyncInvoker<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse>
     */
    public AsyncInvoker<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse> rebootDbOmInstanceAsyncInvoker(
        RebootDbOmInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.rebootDbOmInstance, hcClient);
    }

    /**
     * 重置数据库加密实例的密码
     *
     * 重置数据库加密实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbEncryptPasswordRequest 请求对象
     * @return CompletableFuture<ResetDbEncryptPasswordResponse>
     */
    public CompletableFuture<ResetDbEncryptPasswordResponse> resetDbEncryptPasswordAsync(
        ResetDbEncryptPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.resetDbEncryptPassword);
    }

    /**
     * 重置数据库加密实例的密码
     *
     * 重置数据库加密实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbEncryptPasswordRequest 请求对象
     * @return AsyncInvoker<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse>
     */
    public AsyncInvoker<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse> resetDbEncryptPasswordAsyncInvoker(
        ResetDbEncryptPasswordRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.resetDbEncryptPassword, hcClient);
    }

    /**
     * 重置数据库运维实例的密码
     *
     * 重置数据库运维实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbOmPasswordRequest 请求对象
     * @return CompletableFuture<ResetDbOmPasswordResponse>
     */
    public CompletableFuture<ResetDbOmPasswordResponse> resetDbOmPasswordAsync(ResetDbOmPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.resetDbOmPassword);
    }

    /**
     * 重置数据库运维实例的密码
     *
     * 重置数据库运维实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbOmPasswordRequest 请求对象
     * @return AsyncInvoker<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse>
     */
    public AsyncInvoker<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse> resetDbOmPasswordAsyncInvoker(
        ResetDbOmPasswordRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.resetDbOmPassword, hcClient);
    }

    /**
     * 恢复备份信息
     *
     * 恢复备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAuditBackupRequest 请求对象
     * @return CompletableFuture<RestoreAuditBackupResponse>
     */
    public CompletableFuture<RestoreAuditBackupResponse> restoreAuditBackupAsync(RestoreAuditBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.restoreAuditBackup);
    }

    /**
     * 恢复备份信息
     *
     * 恢复备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAuditBackupRequest 请求对象
     * @return AsyncInvoker<RestoreAuditBackupRequest, RestoreAuditBackupResponse>
     */
    public AsyncInvoker<RestoreAuditBackupRequest, RestoreAuditBackupResponse> restoreAuditBackupAsyncInvoker(
        RestoreAuditBackupRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.restoreAuditBackup, hcClient);
    }

    /**
     * 重试备份任务
     *
     * 重试备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryAuditBackupTaskRequest 请求对象
     * @return CompletableFuture<RetryAuditBackupTaskResponse>
     */
    public CompletableFuture<RetryAuditBackupTaskResponse> retryAuditBackupTaskAsync(
        RetryAuditBackupTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.retryAuditBackupTask);
    }

    /**
     * 重试备份任务
     *
     * 重试备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryAuditBackupTaskRequest 请求对象
     * @return AsyncInvoker<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse>
     */
    public AsyncInvoker<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse> retryAuditBackupTaskAsyncInvoker(
        RetryAuditBackupTaskRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.retryAuditBackupTask, hcClient);
    }

    /**
     * 设置实例告警配置[待下线]
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return CompletableFuture<SetAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public CompletableFuture<SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfoAsync(
        SetAlarmTopicConfigInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAlarmTopicConfigInfo);
    }

    /**
     * 设置实例告警配置[待下线]
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return AsyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfoAsyncInvoker(
        SetAlarmTopicConfigInfoRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoNewRequest 请求对象
     * @return CompletableFuture<SetAlarmTopicConfigInfoNewResponse>
     */
    public CompletableFuture<SetAlarmTopicConfigInfoNewResponse> setAlarmTopicConfigInfoNewAsync(
        SetAlarmTopicConfigInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAlarmTopicConfigInfoNew);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoNewRequest 请求对象
     * @return AsyncInvoker<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse>
     */
    public AsyncInvoker<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse> setAlarmTopicConfigInfoNewAsyncInvoker(
        SetAlarmTopicConfigInfoNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAlarmTopicConfigInfoNew, hcClient);
    }

    /**
     * 标记监控告警
     *
     * 标记监控告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAlarmLogStatusRequest 请求对象
     * @return CompletableFuture<SetAuditAlarmLogStatusResponse>
     */
    public CompletableFuture<SetAuditAlarmLogStatusResponse> setAuditAlarmLogStatusAsync(
        SetAuditAlarmLogStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditAlarmLogStatus);
    }

    /**
     * 标记监控告警
     *
     * 标记监控告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAlarmLogStatusRequest 请求对象
     * @return AsyncInvoker<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse>
     */
    public AsyncInvoker<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse> setAuditAlarmLogStatusAsyncInvoker(
        SetAuditAlarmLogStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditAlarmLogStatus, hcClient);
    }

    /**
     * 获取备份配置信息
     *
     * 设置备份配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAutoBackupTemplateRequest 请求对象
     * @return CompletableFuture<SetAuditAutoBackupTemplateResponse>
     */
    public CompletableFuture<SetAuditAutoBackupTemplateResponse> setAuditAutoBackupTemplateAsync(
        SetAuditAutoBackupTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditAutoBackupTemplate);
    }

    /**
     * 获取备份配置信息
     *
     * 设置备份配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAutoBackupTemplateRequest 请求对象
     * @return AsyncInvoker<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse>
     */
    public AsyncInvoker<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse> setAuditAutoBackupTemplateAsyncInvoker(
        SetAuditAutoBackupTemplateRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditAutoBackupTemplate, hcClient);
    }

    /**
     * 风险导出开关(按DomainId)
     *
     * 风险导出开关(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupRiskSwitchRequest 请求对象
     * @return CompletableFuture<SetAuditBackupRiskSwitchResponse>
     */
    public CompletableFuture<SetAuditBackupRiskSwitchResponse> setAuditBackupRiskSwitchAsync(
        SetAuditBackupRiskSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditBackupRiskSwitch);
    }

    /**
     * 风险导出开关(按DomainId)
     *
     * 风险导出开关(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupRiskSwitchRequest 请求对象
     * @return AsyncInvoker<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse>
     */
    public AsyncInvoker<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse> setAuditBackupRiskSwitchAsyncInvoker(
        SetAuditBackupRiskSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditBackupRiskSwitch, hcClient);
    }

    /**
     * 开启/关闭备份
     *
     * 开启/关闭备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupSwitchRequest 请求对象
     * @return CompletableFuture<SetAuditBackupSwitchResponse>
     */
    public CompletableFuture<SetAuditBackupSwitchResponse> setAuditBackupSwitchAsync(
        SetAuditBackupSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditBackupSwitch);
    }

    /**
     * 开启/关闭备份
     *
     * 开启/关闭备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupSwitchRequest 请求对象
     * @return AsyncInvoker<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse>
     */
    public AsyncInvoker<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse> setAuditBackupSwitchAsyncInvoker(
        SetAuditBackupSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditBackupSwitch, hcClient);
    }

    /**
     * 配置审计实例时区信息
     *
     * 配置审计实例时区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditInstanceTimeZoneRequest 请求对象
     * @return CompletableFuture<SetAuditInstanceTimeZoneResponse>
     */
    public CompletableFuture<SetAuditInstanceTimeZoneResponse> setAuditInstanceTimeZoneAsync(
        SetAuditInstanceTimeZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditInstanceTimeZone);
    }

    /**
     * 配置审计实例时区信息
     *
     * 配置审计实例时区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditInstanceTimeZoneRequest 请求对象
     * @return AsyncInvoker<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse>
     */
    public AsyncInvoker<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse> setAuditInstanceTimeZoneAsyncInvoker(
        SetAuditInstanceTimeZoneRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditInstanceTimeZone, hcClient);
    }

    /**
     * 启用禁用策略
     *
     * 启用禁用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditScopeRuleSwitchRequest 请求对象
     * @return CompletableFuture<SetAuditScopeRuleSwitchResponse>
     */
    public CompletableFuture<SetAuditScopeRuleSwitchResponse> setAuditScopeRuleSwitchAsync(
        SetAuditScopeRuleSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditScopeRuleSwitch);
    }

    /**
     * 启用禁用策略
     *
     * 启用禁用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditScopeRuleSwitchRequest 请求对象
     * @return AsyncInvoker<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse>
     */
    public AsyncInvoker<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse> setAuditScopeRuleSwitchAsyncInvoker(
        SetAuditScopeRuleSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditScopeRuleSwitch, hcClient);
    }

    /**
     * 编辑风险操作策略
     *
     * 编辑风险操作策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskOperationPolicyRequest 请求对象
     * @return CompletableFuture<SetRiskOperationPolicyResponse>
     */
    public CompletableFuture<SetRiskOperationPolicyResponse> setRiskOperationPolicyAsync(
        SetRiskOperationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setRiskOperationPolicy);
    }

    /**
     * 编辑风险操作策略
     *
     * 编辑风险操作策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskOperationPolicyRequest 请求对象
     * @return AsyncInvoker<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse>
     */
    public AsyncInvoker<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse> setRiskOperationPolicyAsyncInvoker(
        SetRiskOperationPolicyRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setRiskOperationPolicy, hcClient);
    }

    /**
     * 审计实例风险规则排序
     *
     * 审计实例风险规则排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskRuleRankRequest 请求对象
     * @return CompletableFuture<SetRiskRuleRankResponse>
     */
    public CompletableFuture<SetRiskRuleRankResponse> setRiskRuleRankAsync(SetRiskRuleRankRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setRiskRuleRank);
    }

    /**
     * 审计实例风险规则排序
     *
     * 审计实例风险规则排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskRuleRankRequest 请求对象
     * @return AsyncInvoker<SetRiskRuleRankRequest, SetRiskRuleRankResponse>
     */
    public AsyncInvoker<SetRiskRuleRankRequest, SetRiskRuleRankResponse> setRiskRuleRankAsyncInvoker(
        SetRiskRuleRankRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setRiskRuleRank, hcClient);
    }

    /**
     * 启用禁用单条隐私数据脱敏规则
     *
     * 启用禁用隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveMaskRuleSwitchRequest 请求对象
     * @return CompletableFuture<SetSensitiveMaskRuleSwitchResponse>
     */
    public CompletableFuture<SetSensitiveMaskRuleSwitchResponse> setSensitiveMaskRuleSwitchAsync(
        SetSensitiveMaskRuleSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setSensitiveMaskRuleSwitch);
    }

    /**
     * 启用禁用单条隐私数据脱敏规则
     *
     * 启用禁用隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveMaskRuleSwitchRequest 请求对象
     * @return AsyncInvoker<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse>
     */
    public AsyncInvoker<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse> setSensitiveMaskRuleSwitchAsyncInvoker(
        SetSensitiveMaskRuleSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setSensitiveMaskRuleSwitch, hcClient);
    }

    /**
     * 开启关闭结果集存储
     *
     * 开启关闭结果集存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveResultSwitchRequest 请求对象
     * @return CompletableFuture<SetSensitiveResultSwitchResponse>
     */
    public CompletableFuture<SetSensitiveResultSwitchResponse> setSensitiveResultSwitchAsync(
        SetSensitiveResultSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setSensitiveResultSwitch);
    }

    /**
     * 开启关闭结果集存储
     *
     * 开启关闭结果集存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveResultSwitchRequest 请求对象
     * @return AsyncInvoker<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse>
     */
    public AsyncInvoker<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse> setSensitiveResultSwitchAsyncInvoker(
        SetSensitiveResultSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setSensitiveResultSwitch, hcClient);
    }

    /**
     * 开启关闭隐私数据脱敏功能
     *
     * 开启关闭隐私数据脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSwitchRequest 请求对象
     * @return CompletableFuture<SetSensitiveSwitchResponse>
     */
    public CompletableFuture<SetSensitiveSwitchResponse> setSensitiveSwitchAsync(SetSensitiveSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setSensitiveSwitch);
    }

    /**
     * 开启关闭隐私数据脱敏功能
     *
     * 开启关闭隐私数据脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSwitchRequest 请求对象
     * @return AsyncInvoker<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse>
     */
    public AsyncInvoker<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse> setSensitiveSwitchAsyncInvoker(
        SetSensitiveSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setSensitiveSwitch, hcClient);
    }

    /**
     * 获取单个风险导出配置
     *
     * 获取单个风险导出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackRiskTemplateRequest 请求对象
     * @return CompletableFuture<ShowAuditBackRiskTemplateResponse>
     */
    public CompletableFuture<ShowAuditBackRiskTemplateResponse> showAuditBackRiskTemplateAsync(
        ShowAuditBackRiskTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditBackRiskTemplate);
    }

    /**
     * 获取单个风险导出配置
     *
     * 获取单个风险导出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackRiskTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse>
     */
    public AsyncInvoker<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse> showAuditBackRiskTemplateAsyncInvoker(
        ShowAuditBackRiskTemplateRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditBackRiskTemplate, hcClient);
    }

    /**
     * 获取备份状态
     *
     * 获取备份状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackupStatusRequest 请求对象
     * @return CompletableFuture<ShowAuditBackupStatusResponse>
     */
    public CompletableFuture<ShowAuditBackupStatusResponse> showAuditBackupStatusAsync(
        ShowAuditBackupStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditBackupStatus);
    }

    /**
     * 获取备份状态
     *
     * 获取备份状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackupStatusRequest 请求对象
     * @return AsyncInvoker<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse>
     */
    public AsyncInvoker<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse> showAuditBackupStatusAsyncInvoker(
        ShowAuditBackupStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditBackupStatus, hcClient);
    }

    /**
     * 查询账户配额信息[待下线]
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return CompletableFuture<ShowAuditQuotaResponse>
     */
    @Deprecated
    public CompletableFuture<ShowAuditQuotaResponse> showAuditQuotaAsync(ShowAuditQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditQuota);
    }

    /**
     * 查询账户配额信息[待下线]
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuotaAsyncInvoker(
        ShowAuditQuotaRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditQuota, hcClient);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaNewRequest 请求对象
     * @return CompletableFuture<ShowAuditQuotaNewResponse>
     */
    public CompletableFuture<ShowAuditQuotaNewResponse> showAuditQuotaNewAsync(ShowAuditQuotaNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditQuotaNew);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaNewRequest 请求对象
     * @return AsyncInvoker<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse>
     */
    public AsyncInvoker<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse> showAuditQuotaNewAsyncInvoker(
        ShowAuditQuotaNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditQuotaNew, hcClient);
    }

    /**
     * 查询指定风险规则策略[待下线]
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return CompletableFuture<ShowAuditRuleRiskResponse>
     */
    @Deprecated
    public CompletableFuture<ShowAuditRuleRiskResponse> showAuditRuleRiskAsync(ShowAuditRuleRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditRuleRisk);
    }

    /**
     * 查询指定风险规则策略[待下线]
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return AsyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRiskAsyncInvoker(
        ShowAuditRuleRiskRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditRuleRisk, hcClient);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskNewRequest 请求对象
     * @return CompletableFuture<ShowAuditRuleRiskNewResponse>
     */
    public CompletableFuture<ShowAuditRuleRiskNewResponse> showAuditRuleRiskNewAsync(
        ShowAuditRuleRiskNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditRuleRiskNew);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskNewRequest 请求对象
     * @return AsyncInvoker<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse>
     */
    public AsyncInvoker<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse> showAuditRuleRiskNewAsyncInvoker(
        ShowAuditRuleRiskNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditRuleRiskNew, hcClient);
    }

    /**
     * 获取租户下所有实例的风险汇总信息
     *
     * 获取租户下所有实例的风险汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditStatisticsRequest 请求对象
     * @return CompletableFuture<ShowAuditStatisticsResponse>
     */
    public CompletableFuture<ShowAuditStatisticsResponse> showAuditStatisticsAsync(ShowAuditStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditStatistics);
    }

    /**
     * 获取租户下所有实例的风险汇总信息
     *
     * 获取租户下所有实例的风险汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse>
     */
    public AsyncInvoker<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse> showAuditStatisticsAsyncInvoker(
        ShowAuditStatisticsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditStatistics, hcClient);
    }

    /**
     * 获取租户审计信息汇总任务状态
     *
     * 获取租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTaskStatusRequest 请求对象
     * @return CompletableFuture<ShowAuditTaskStatusResponse>
     */
    public CompletableFuture<ShowAuditTaskStatusResponse> showAuditTaskStatusAsync(ShowAuditTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditTaskStatus);
    }

    /**
     * 获取租户审计信息汇总任务状态
     *
     * 获取租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTaskStatusRequest 请求对象
     * @return AsyncInvoker<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse>
     */
    public AsyncInvoker<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse> showAuditTaskStatusAsyncInvoker(
        ShowAuditTaskStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditTaskStatus, hcClient);
    }

    /**
     * 获取报表的计划任务配置信息（topic方式）
     *
     * 获取报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTopicReportSchedulerConfigRequest 请求对象
     * @return CompletableFuture<ShowAuditTopicReportSchedulerConfigResponse>
     */
    public CompletableFuture<ShowAuditTopicReportSchedulerConfigResponse> showAuditTopicReportSchedulerConfigAsync(
        ShowAuditTopicReportSchedulerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditTopicReportSchedulerConfig);
    }

    /**
     * 获取报表的计划任务配置信息（topic方式）
     *
     * 获取报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTopicReportSchedulerConfigRequest 请求对象
     * @return AsyncInvoker<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse>
     */
    public AsyncInvoker<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse> showAuditTopicReportSchedulerConfigAsyncInvoker(
        ShowAuditTopicReportSchedulerConfigRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditTopicReportSchedulerConfig, hcClient);
    }

    /**
     * 查询租户的实例是否可升级
     *
     * 查询租户的实例是否可升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditUpgradeStatusRequest 请求对象
     * @return CompletableFuture<ShowAuditUpgradeStatusResponse>
     */
    public CompletableFuture<ShowAuditUpgradeStatusResponse> showAuditUpgradeStatusAsync(
        ShowAuditUpgradeStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showAuditUpgradeStatus);
    }

    /**
     * 查询租户的实例是否可升级
     *
     * 查询租户的实例是否可升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditUpgradeStatusRequest 请求对象
     * @return AsyncInvoker<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse>
     */
    public AsyncInvoker<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse> showAuditUpgradeStatusAsyncInvoker(
        ShowAuditUpgradeStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showAuditUpgradeStatus, hcClient);
    }

    /**
     * 获取风险导出桶名和路径
     *
     * 获取风险导出桶名和路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRiskBucketPathRequest 请求对象
     * @return CompletableFuture<ShowBackupRiskBucketPathResponse>
     */
    public CompletableFuture<ShowBackupRiskBucketPathResponse> showBackupRiskBucketPathAsync(
        ShowBackupRiskBucketPathRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showBackupRiskBucketPath);
    }

    /**
     * 获取风险导出桶名和路径
     *
     * 获取风险导出桶名和路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRiskBucketPathRequest 请求对象
     * @return AsyncInvoker<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse>
     */
    public AsyncInvoker<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse> showBackupRiskBucketPathAsyncInvoker(
        ShowBackupRiskBucketPathRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showBackupRiskBucketPath, hcClient);
    }

    /**
     * 获取实例监控数据
     *
     * 获取实例监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceMonitorInfoResponse>
     */
    public CompletableFuture<ShowInstanceMonitorInfoResponse> showInstanceMonitorInfoAsync(
        ShowInstanceMonitorInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showInstanceMonitorInfo);
    }

    /**
     * 获取实例监控数据
     *
     * 获取实例监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse>
     */
    public AsyncInvoker<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse> showInstanceMonitorInfoAsyncInvoker(
        ShowInstanceMonitorInfoRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showInstanceMonitorInfo, hcClient);
    }

    /**
     * 查询加密/运维增强配额
     *
     * 查询加密/运维增强配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceQuotaRequest 请求对象
     * @return CompletableFuture<ShowInstanceQuotaResponse>
     */
    public CompletableFuture<ShowInstanceQuotaResponse> showInstanceQuotaAsync(ShowInstanceQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showInstanceQuota);
    }

    /**
     * 查询加密/运维增强配额
     *
     * 查询加密/运维增强配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceQuotaRequest 请求对象
     * @return AsyncInvoker<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse>
     */
    public AsyncInvoker<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse> showInstanceQuotaAsyncInvoker(
        ShowInstanceQuotaRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showInstanceQuota, hcClient);
    }

    /**
     * 获取隐私数据脱敏开关
     *
     * 获取隐私数据脱敏开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveMaskSwitchRequest 请求对象
     * @return CompletableFuture<ShowSensitiveMaskSwitchResponse>
     */
    public CompletableFuture<ShowSensitiveMaskSwitchResponse> showSensitiveMaskSwitchAsync(
        ShowSensitiveMaskSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showSensitiveMaskSwitch);
    }

    /**
     * 获取隐私数据脱敏开关
     *
     * 获取隐私数据脱敏开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveMaskSwitchRequest 请求对象
     * @return AsyncInvoker<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse>
     */
    public AsyncInvoker<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse> showSensitiveMaskSwitchAsyncInvoker(
        ShowSensitiveMaskSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showSensitiveMaskSwitch, hcClient);
    }

    /**
     * 获取隐私数据结果集开关
     *
     * 获取隐私数据结果集开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveResultSwitchRequest 请求对象
     * @return CompletableFuture<ShowSensitiveResultSwitchResponse>
     */
    public CompletableFuture<ShowSensitiveResultSwitchResponse> showSensitiveResultSwitchAsync(
        ShowSensitiveResultSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showSensitiveResultSwitch);
    }

    /**
     * 获取隐私数据结果集开关
     *
     * 获取隐私数据结果集开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveResultSwitchRequest 请求对象
     * @return AsyncInvoker<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse>
     */
    public AsyncInvoker<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse> showSensitiveResultSwitchAsyncInvoker(
        ShowSensitiveResultSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showSensitiveResultSwitch, hcClient);
    }

    /**
     * 获取管理侧版本信息
     *
     * 获取管理侧版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVersionRequest 请求对象
     * @return CompletableFuture<ShowServerVersionResponse>
     */
    public CompletableFuture<ShowServerVersionResponse> showServerVersionAsync(ShowServerVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showServerVersion);
    }

    /**
     * 获取管理侧版本信息
     *
     * 获取管理侧版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVersionRequest 请求对象
     * @return AsyncInvoker<ShowServerVersionRequest, ShowServerVersionResponse>
     */
    public AsyncInvoker<ShowServerVersionRequest, ShowServerVersionResponse> showServerVersionAsyncInvoker(
        ShowServerVersionRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showServerVersion, hcClient);
    }

    /**
     * 获取指定SQL语句的详细信息
     *
     * 获取指定SQL语句的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlDetailRequest 请求对象
     * @return CompletableFuture<ShowSqlDetailResponse>
     */
    public CompletableFuture<ShowSqlDetailResponse> showSqlDetailAsync(ShowSqlDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.showSqlDetail);
    }

    /**
     * 获取指定SQL语句的详细信息
     *
     * 获取指定SQL语句的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlDetailRequest 请求对象
     * @return AsyncInvoker<ShowSqlDetailRequest, ShowSqlDetailResponse>
     */
    public AsyncInvoker<ShowSqlDetailRequest, ShowSqlDetailResponse> showSqlDetailAsyncInvoker(
        ShowSqlDetailRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.showSqlDetail, hcClient);
    }

    /**
     * 开启审计实例[待下线]
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return CompletableFuture<StartAuditInstanceResponse>
     */
    @Deprecated
    public CompletableFuture<StartAuditInstanceResponse> startAuditInstanceAsync(StartAuditInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.startAuditInstance);
    }

    /**
     * 开启审计实例[待下线]
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return AsyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse>
     */
    @Deprecated
    public AsyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse> startAuditInstanceAsyncInvoker(
        StartAuditInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.startAuditInstance, hcClient);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceNewRequest 请求对象
     * @return CompletableFuture<StartAuditInstanceNewResponse>
     */
    public CompletableFuture<StartAuditInstanceNewResponse> startAuditInstanceNewAsync(
        StartAuditInstanceNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.startAuditInstanceNew);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceNewRequest 请求对象
     * @return AsyncInvoker<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse>
     */
    public AsyncInvoker<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse> startAuditInstanceNewAsyncInvoker(
        StartAuditInstanceNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.startAuditInstanceNew, hcClient);
    }

    /**
     * 启动数据库加密实例
     *
     * 启动数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbEncryptInstanceRequest 请求对象
     * @return CompletableFuture<StartDbEncryptInstanceResponse>
     */
    public CompletableFuture<StartDbEncryptInstanceResponse> startDbEncryptInstanceAsync(
        StartDbEncryptInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.startDbEncryptInstance);
    }

    /**
     * 启动数据库加密实例
     *
     * 启动数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbEncryptInstanceRequest 请求对象
     * @return AsyncInvoker<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse>
     */
    public AsyncInvoker<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse> startDbEncryptInstanceAsyncInvoker(
        StartDbEncryptInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.startDbEncryptInstance, hcClient);
    }

    /**
     * 启动数据库运维实例
     *
     * 启动数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbOmInstanceRequest 请求对象
     * @return CompletableFuture<StartDbOmInstanceResponse>
     */
    public CompletableFuture<StartDbOmInstanceResponse> startDbOmInstanceAsync(StartDbOmInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.startDbOmInstance);
    }

    /**
     * 启动数据库运维实例
     *
     * 启动数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbOmInstanceRequest 请求对象
     * @return AsyncInvoker<StartDbOmInstanceRequest, StartDbOmInstanceResponse>
     */
    public AsyncInvoker<StartDbOmInstanceRequest, StartDbOmInstanceResponse> startDbOmInstanceAsyncInvoker(
        StartDbOmInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.startDbOmInstance, hcClient);
    }

    /**
     * 关闭审计实例[待下线]
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return CompletableFuture<StopAuditInstanceResponse>
     */
    @Deprecated
    public CompletableFuture<StopAuditInstanceResponse> stopAuditInstanceAsync(StopAuditInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.stopAuditInstance);
    }

    /**
     * 关闭审计实例[待下线]
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return AsyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse>
     */
    @Deprecated
    public AsyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse> stopAuditInstanceAsyncInvoker(
        StopAuditInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.stopAuditInstance, hcClient);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceNewRequest 请求对象
     * @return CompletableFuture<StopAuditInstanceNewResponse>
     */
    public CompletableFuture<StopAuditInstanceNewResponse> stopAuditInstanceNewAsync(
        StopAuditInstanceNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.stopAuditInstanceNew);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceNewRequest 请求对象
     * @return AsyncInvoker<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse>
     */
    public AsyncInvoker<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse> stopAuditInstanceNewAsyncInvoker(
        StopAuditInstanceNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.stopAuditInstanceNew, hcClient);
    }

    /**
     * 停止数据库加密实例
     *
     * 停止数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbEncryptInstanceRequest 请求对象
     * @return CompletableFuture<StopDbEncryptInstanceResponse>
     */
    public CompletableFuture<StopDbEncryptInstanceResponse> stopDbEncryptInstanceAsync(
        StopDbEncryptInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.stopDbEncryptInstance);
    }

    /**
     * 停止数据库加密实例
     *
     * 停止数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbEncryptInstanceRequest 请求对象
     * @return AsyncInvoker<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse>
     */
    public AsyncInvoker<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse> stopDbEncryptInstanceAsyncInvoker(
        StopDbEncryptInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.stopDbEncryptInstance, hcClient);
    }

    /**
     * 停止数据库运维实例
     *
     * 停止数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbOmInstanceRequest 请求对象
     * @return CompletableFuture<StopDbOmInstanceResponse>
     */
    public CompletableFuture<StopDbOmInstanceResponse> stopDbOmInstanceAsync(StopDbOmInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.stopDbOmInstance);
    }

    /**
     * 停止数据库运维实例
     *
     * 停止数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbOmInstanceRequest 请求对象
     * @return AsyncInvoker<StopDbOmInstanceRequest, StopDbOmInstanceResponse>
     */
    public AsyncInvoker<StopDbOmInstanceRequest, StopDbOmInstanceResponse> stopDbOmInstanceAsyncInvoker(
        StopDbOmInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.stopDbOmInstance, hcClient);
    }

    /**
     * 开启关闭Agent[待下线]
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return CompletableFuture<SwitchAgentResponse>
     */
    @Deprecated
    public CompletableFuture<SwitchAgentResponse> switchAgentAsync(SwitchAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent[待下线]
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    @Deprecated
    public AsyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentAsyncInvoker(SwitchAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭数据库[待下线]
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return CompletableFuture<SwitchAuditDatabaseResponse>
     */
    @Deprecated
    public CompletableFuture<SwitchAuditDatabaseResponse> switchAuditDatabaseAsync(SwitchAuditDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAuditDatabase);
    }

    /**
     * 开启关闭数据库[待下线]
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return AsyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse>
     */
    @Deprecated
    public AsyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> switchAuditDatabaseAsyncInvoker(
        SwitchAuditDatabaseRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchAuditDatabase, hcClient);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseNewRequest 请求对象
     * @return CompletableFuture<SwitchAuditDatabaseNewResponse>
     */
    public CompletableFuture<SwitchAuditDatabaseNewResponse> switchAuditDatabaseNewAsync(
        SwitchAuditDatabaseNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAuditDatabaseNew);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseNewRequest 请求对象
     * @return AsyncInvoker<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse>
     */
    public AsyncInvoker<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse> switchAuditDatabaseNewAsyncInvoker(
        SwitchAuditDatabaseNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchAuditDatabaseNew, hcClient);
    }

    /**
     * 开启关闭风险规则[待下线]
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return CompletableFuture<SwitchRiskRuleResponse>
     */
    @Deprecated
    public CompletableFuture<SwitchRiskRuleResponse> switchRiskRuleAsync(SwitchRiskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则[待下线]
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    @Deprecated
    public AsyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleAsyncInvoker(
        SwitchRiskRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchRiskRule, hcClient);
    }

    /**
     * 开启/关闭风险规则
     *
     * 开启/关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleNewRequest 请求对象
     * @return CompletableFuture<SwitchRiskRuleNewResponse>
     */
    public CompletableFuture<SwitchRiskRuleNewResponse> switchRiskRuleNewAsync(SwitchRiskRuleNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchRiskRuleNew);
    }

    /**
     * 开启/关闭风险规则
     *
     * 开启/关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleNewRequest 请求对象
     * @return AsyncInvoker<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse>
     */
    public AsyncInvoker<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse> switchRiskRuleNewAsyncInvoker(
        SwitchRiskRuleNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchRiskRuleNew, hcClient);
    }

    /**
     * 解绑数据库加密实例的eip
     *
     * 解绑数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbEncryptEipRequest 请求对象
     * @return CompletableFuture<UnbindDbEncryptEipResponse>
     */
    public CompletableFuture<UnbindDbEncryptEipResponse> unbindDbEncryptEipAsync(UnbindDbEncryptEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.unbindDbEncryptEip);
    }

    /**
     * 解绑数据库加密实例的eip
     *
     * 解绑数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbEncryptEipRequest 请求对象
     * @return AsyncInvoker<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse>
     */
    public AsyncInvoker<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse> unbindDbEncryptEipAsyncInvoker(
        UnbindDbEncryptEipRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.unbindDbEncryptEip, hcClient);
    }

    /**
     * 解绑数据库运维实例的eip
     *
     * 解绑数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbOmEipRequest 请求对象
     * @return CompletableFuture<UnbindDbOmEipResponse>
     */
    public CompletableFuture<UnbindDbOmEipResponse> unbindDbOmEipAsync(UnbindDbOmEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.unbindDbOmEip);
    }

    /**
     * 解绑数据库运维实例的eip
     *
     * 解绑数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbOmEipRequest 请求对象
     * @return AsyncInvoker<UnbindDbOmEipRequest, UnbindDbOmEipResponse>
     */
    public AsyncInvoker<UnbindDbOmEipRequest, UnbindDbOmEipResponse> unbindDbOmEipAsyncInvoker(
        UnbindDbOmEipRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.unbindDbOmEip, hcClient);
    }

    /**
     * 更新审计实例信息[待下线]
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return CompletableFuture<UpdateAuditInstanceResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateAuditInstanceResponse> updateAuditInstanceAsync(UpdateAuditInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditInstance);
    }

    /**
     * 更新审计实例信息[待下线]
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> updateAuditInstanceAsyncInvoker(
        UpdateAuditInstanceRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditInstance, hcClient);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceNewRequest 请求对象
     * @return CompletableFuture<UpdateAuditInstanceNewResponse>
     */
    public CompletableFuture<UpdateAuditInstanceNewResponse> updateAuditInstanceNewAsync(
        UpdateAuditInstanceNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditInstanceNew);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceNewRequest 请求对象
     * @return AsyncInvoker<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse>
     */
    public AsyncInvoker<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse> updateAuditInstanceNewAsyncInvoker(
        UpdateAuditInstanceNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditInstanceNew, hcClient);
    }

    /**
     * 修改风险导出桶名和路径(按DomainId)
     *
     * 修改风险导出桶名和路径(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditRiskBucketPathRequest 请求对象
     * @return CompletableFuture<UpdateAuditRiskBucketPathResponse>
     */
    public CompletableFuture<UpdateAuditRiskBucketPathResponse> updateAuditRiskBucketPathAsync(
        UpdateAuditRiskBucketPathRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditRiskBucketPath);
    }

    /**
     * 修改风险导出桶名和路径(按DomainId)
     *
     * 修改风险导出桶名和路径(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditRiskBucketPathRequest 请求对象
     * @return AsyncInvoker<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse>
     */
    public AsyncInvoker<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse> updateAuditRiskBucketPathAsyncInvoker(
        UpdateAuditRiskBucketPathRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditRiskBucketPath, hcClient);
    }

    /**
     * 编辑审计范围规则
     *
     * 编辑审计范围规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditScopeRuleRequest 请求对象
     * @return CompletableFuture<UpdateAuditScopeRuleResponse>
     */
    public CompletableFuture<UpdateAuditScopeRuleResponse> updateAuditScopeRuleAsync(
        UpdateAuditScopeRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditScopeRule);
    }

    /**
     * 编辑审计范围规则
     *
     * 编辑审计范围规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditScopeRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse>
     */
    public AsyncInvoker<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse> updateAuditScopeRuleAsyncInvoker(
        UpdateAuditScopeRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditScopeRule, hcClient);
    }

    /**
     * 修改实例安全组[待下线]
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateAuditSecurityGroupResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupAsync(
        UpdateAuditSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditSecurityGroup);
    }

    /**
     * 修改实例安全组[待下线]
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupAsyncInvoker(
        UpdateAuditSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditSecurityGroup, hcClient);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupNewRequest 请求对象
     * @return CompletableFuture<UpdateAuditSecurityGroupNewResponse>
     */
    public CompletableFuture<UpdateAuditSecurityGroupNewResponse> updateAuditSecurityGroupNewAsync(
        UpdateAuditSecurityGroupNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditSecurityGroupNew);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupNewRequest 请求对象
     * @return AsyncInvoker<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse>
     */
    public AsyncInvoker<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse> updateAuditSecurityGroupNewAsyncInvoker(
        UpdateAuditSecurityGroupNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditSecurityGroupNew, hcClient);
    }

    /**
     * 更新租户审计信息汇总任务状态
     *
     * 更新租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTaskStatusRequest 请求对象
     * @return CompletableFuture<UpdateAuditTaskStatusResponse>
     */
    public CompletableFuture<UpdateAuditTaskStatusResponse> updateAuditTaskStatusAsync(
        UpdateAuditTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditTaskStatus);
    }

    /**
     * 更新租户审计信息汇总任务状态
     *
     * 更新租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTaskStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse>
     */
    public AsyncInvoker<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse> updateAuditTaskStatusAsyncInvoker(
        UpdateAuditTaskStatusRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditTaskStatus, hcClient);
    }

    /**
     * 更改报表的计划任务配置信息（topic方式）
     *
     * 更改报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTopicReportSchedulerConfigRequest 请求对象
     * @return CompletableFuture<UpdateAuditTopicReportSchedulerConfigResponse>
     */
    public CompletableFuture<UpdateAuditTopicReportSchedulerConfigResponse> updateAuditTopicReportSchedulerConfigAsync(
        UpdateAuditTopicReportSchedulerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditTopicReportSchedulerConfig);
    }

    /**
     * 更改报表的计划任务配置信息（topic方式）
     *
     * 更改报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTopicReportSchedulerConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse>
     */
    public AsyncInvoker<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse> updateAuditTopicReportSchedulerConfigAsyncInvoker(
        UpdateAuditTopicReportSchedulerConfigRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditTopicReportSchedulerConfig, hcClient);
    }

    /**
     * 更改数据库加密实例的名称
     *
     * 更改数据库加密实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbEncryptInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateDbEncryptInstanceNameResponse>
     */
    public CompletableFuture<UpdateDbEncryptInstanceNameResponse> updateDbEncryptInstanceNameAsync(
        UpdateDbEncryptInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateDbEncryptInstanceName);
    }

    /**
     * 更改数据库加密实例的名称
     *
     * 更改数据库加密实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbEncryptInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse>
     */
    public AsyncInvoker<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse> updateDbEncryptInstanceNameAsyncInvoker(
        UpdateDbEncryptInstanceNameRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateDbEncryptInstanceName, hcClient);
    }

    /**
     * 更改数据库运维实例的名称
     *
     * 更改数据库运维实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbOmInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateDbOmInstanceNameResponse>
     */
    public CompletableFuture<UpdateDbOmInstanceNameResponse> updateDbOmInstanceNameAsync(
        UpdateDbOmInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateDbOmInstanceName);
    }

    /**
     * 更改数据库运维实例的名称
     *
     * 更改数据库运维实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbOmInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse>
     */
    public AsyncInvoker<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse> updateDbOmInstanceNameAsyncInvoker(
        UpdateDbOmInstanceNameRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateDbOmInstanceName, hcClient);
    }

    /**
     * 修改编辑隐私数据脱敏规则
     *
     * 修改编辑隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSensitiveMaskRuleRequest 请求对象
     * @return CompletableFuture<UpdateSensitiveMaskRuleResponse>
     */
    public CompletableFuture<UpdateSensitiveMaskRuleResponse> updateSensitiveMaskRuleAsync(
        UpdateSensitiveMaskRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateSensitiveMaskRule);
    }

    /**
     * 修改编辑隐私数据脱敏规则
     *
     * 修改编辑隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSensitiveMaskRuleRequest 请求对象
     * @return AsyncInvoker<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse>
     */
    public AsyncInvoker<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse> updateSensitiveMaskRuleAsyncInvoker(
        UpdateSensitiveMaskRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateSensitiveMaskRule, hcClient);
    }

    /**
     * 往OBS导出审计数据库配置
     *
     * 往OBS导出审计数据库配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAuditDbConfigRequest 请求对象
     * @return CompletableFuture<UploadAuditDbConfigResponse>
     */
    public CompletableFuture<UploadAuditDbConfigResponse> uploadAuditDbConfigAsync(UploadAuditDbConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.uploadAuditDbConfig);
    }

    /**
     * 往OBS导出审计数据库配置
     *
     * 往OBS导出审计数据库配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAuditDbConfigRequest 请求对象
     * @return AsyncInvoker<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse>
     */
    public AsyncInvoker<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse> uploadAuditDbConfigAsyncInvoker(
        UploadAuditDbConfigRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.uploadAuditDbConfig, hcClient);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentNewRequest 请求对象
     * @return CompletableFuture<AddAuditAgentNewResponse>
     */
    public CompletableFuture<AddAuditAgentNewResponse> addAuditAgentNewAsync(AddAuditAgentNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.addAuditAgentNew);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentNewRequest 请求对象
     * @return AsyncInvoker<AddAuditAgentNewRequest, AddAuditAgentNewResponse>
     */
    public AsyncInvoker<AddAuditAgentNewRequest, AddAuditAgentNewResponse> addAuditAgentNewAsyncInvoker(
        AddAuditAgentNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.addAuditAgentNew, hcClient);
    }

    /**
     * 指定agent_id方式添加agent
     *
     * 指定agent_id方式添加agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditDbAgentRequest 请求对象
     * @return CompletableFuture<CreateAuditDbAgentResponse>
     */
    public CompletableFuture<CreateAuditDbAgentResponse> createAuditDbAgentAsync(CreateAuditDbAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createAuditDbAgent);
    }

    /**
     * 指定agent_id方式添加agent
     *
     * 指定agent_id方式添加agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditDbAgentRequest 请求对象
     * @return AsyncInvoker<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse>
     */
    public AsyncInvoker<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse> createAuditDbAgentAsyncInvoker(
        CreateAuditDbAgentRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createAuditDbAgent, hcClient);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentNewRequest 请求对象
     * @return CompletableFuture<DeleteAuditAgentNewResponse>
     */
    public CompletableFuture<DeleteAuditAgentNewResponse> deleteAuditAgentNewAsync(DeleteAuditAgentNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditAgentNew);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentNewRequest 请求对象
     * @return AsyncInvoker<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse>
     */
    public AsyncInvoker<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse> deleteAuditAgentNewAsyncInvoker(
        DeleteAuditAgentNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditAgentNew, hcClient);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentNewRequest 请求对象
     * @return CompletableFuture<DownloadAuditAgentNewResponse>
     */
    public CompletableFuture<DownloadAuditAgentNewResponse> downloadAuditAgentNewAsync(
        DownloadAuditAgentNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.downloadAuditAgentNew);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentNewRequest 请求对象
     * @return AsyncInvoker<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse>
     */
    public AsyncInvoker<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse> downloadAuditAgentNewAsyncInvoker(
        DownloadAuditAgentNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.downloadAuditAgentNew, hcClient);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentNewRequest 请求对象
     * @return CompletableFuture<ListAuditAgentNewResponse>
     */
    public CompletableFuture<ListAuditAgentNewResponse> listAuditAgentNewAsync(ListAuditAgentNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditAgentNew);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentNewRequest 请求对象
     * @return AsyncInvoker<ListAuditAgentNewRequest, ListAuditAgentNewResponse>
     */
    public AsyncInvoker<ListAuditAgentNewRequest, ListAuditAgentNewResponse> listAuditAgentNewAsyncInvoker(
        ListAuditAgentNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditAgentNew, hcClient);
    }

    /**
     * 开启/关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentNewRequest 请求对象
     * @return CompletableFuture<SwitchAgentNewResponse>
     */
    public CompletableFuture<SwitchAgentNewResponse> switchAgentNewAsync(SwitchAgentNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.switchAgentNew);
    }

    /**
     * 开启/关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentNewRequest 请求对象
     * @return AsyncInvoker<SwitchAgentNewRequest, SwitchAgentNewResponse>
     */
    public AsyncInvoker<SwitchAgentNewRequest, SwitchAgentNewResponse> switchAgentNewAsyncInvoker(
        SwitchAgentNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.switchAgentNew, hcClient);
    }

    /**
     * 批量添加白名单
     *
     * 批量添加白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAuditWhitelistRequest 请求对象
     * @return CompletableFuture<BatchAddAuditWhitelistResponse>
     */
    public CompletableFuture<BatchAddAuditWhitelistResponse> batchAddAuditWhitelistAsync(
        BatchAddAuditWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchAddAuditWhitelist);
    }

    /**
     * 批量添加白名单
     *
     * 批量添加白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAuditWhitelistRequest 请求对象
     * @return AsyncInvoker<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse>
     */
    public AsyncInvoker<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse> batchAddAuditWhitelistAsyncInvoker(
        BatchAddAuditWhitelistRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchAddAuditWhitelist, hcClient);
    }

    /**
     * 添加sql自定义规则
     *
     * 添加sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditSqlRuleRequest 请求对象
     * @return CompletableFuture<CreateAuditSqlRuleResponse>
     */
    public CompletableFuture<CreateAuditSqlRuleResponse> createAuditSqlRuleAsync(CreateAuditSqlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.createAuditSqlRule);
    }

    /**
     * 添加sql自定义规则
     *
     * 添加sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditSqlRuleRequest 请求对象
     * @return AsyncInvoker<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse>
     */
    public AsyncInvoker<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse> createAuditSqlRuleAsyncInvoker(
        CreateAuditSqlRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.createAuditSqlRule, hcClient);
    }

    /**
     * 删除sql自定义规则
     *
     * 删除sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleSqlRequest 请求对象
     * @return CompletableFuture<DeleteAuditRuleSqlResponse>
     */
    public CompletableFuture<DeleteAuditRuleSqlResponse> deleteAuditRuleSqlAsync(DeleteAuditRuleSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditRuleSql);
    }

    /**
     * 删除sql自定义规则
     *
     * 删除sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleSqlRequest 请求对象
     * @return AsyncInvoker<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse>
     */
    public AsyncInvoker<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse> deleteAuditRuleSqlAsyncInvoker(
        DeleteAuditRuleSqlRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditRuleSql, hcClient);
    }

    /**
     * 批量删除白名单
     *
     * 批量删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditWhitelistRequest 请求对象
     * @return CompletableFuture<DeleteAuditWhitelistResponse>
     */
    public CompletableFuture<DeleteAuditWhitelistResponse> deleteAuditWhitelistAsync(
        DeleteAuditWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.deleteAuditWhitelist);
    }

    /**
     * 批量删除白名单
     *
     * 批量删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditWhitelistRequest 请求对象
     * @return AsyncInvoker<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse>
     */
    public AsyncInvoker<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse> deleteAuditWhitelistAsyncInvoker(
        DeleteAuditWhitelistRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.deleteAuditWhitelist, hcClient);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesNewRequest 请求对象
     * @return CompletableFuture<ListSqlInjectionRulesNewResponse>
     */
    public CompletableFuture<ListSqlInjectionRulesNewResponse> listSqlInjectionRulesNewAsync(
        ListSqlInjectionRulesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listSqlInjectionRulesNew);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesNewRequest 请求对象
     * @return AsyncInvoker<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse>
     */
    public AsyncInvoker<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse> listSqlInjectionRulesNewAsyncInvoker(
        ListSqlInjectionRulesNewRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listSqlInjectionRulesNew, hcClient);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhitelistsRequest 请求对象
     * @return CompletableFuture<ListWhitelistsResponse>
     */
    public CompletableFuture<ListWhitelistsResponse> listWhitelistsAsync(ListWhitelistsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listWhitelists);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhitelistsRequest 请求对象
     * @return AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>
     */
    public AsyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelistsAsyncInvoker(
        ListWhitelistsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listWhitelists, hcClient);
    }

    /**
     * 开启关闭sql注入策略
     *
     * 开启关闭sql注入策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditSqlRuleSwitchRequest 请求对象
     * @return CompletableFuture<SetAuditSqlRuleSwitchResponse>
     */
    public CompletableFuture<SetAuditSqlRuleSwitchResponse> setAuditSqlRuleSwitchAsync(
        SetAuditSqlRuleSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setAuditSqlRuleSwitch);
    }

    /**
     * 开启关闭sql注入策略
     *
     * 开启关闭sql注入策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditSqlRuleSwitchRequest 请求对象
     * @return AsyncInvoker<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse>
     */
    public AsyncInvoker<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse> setAuditSqlRuleSwitchAsyncInvoker(
        SetAuditSqlRuleSwitchRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setAuditSqlRuleSwitch, hcClient);
    }

    /**
     * sql规则优先级排序
     *
     * sql规则优先级排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlRuleRankRequest 请求对象
     * @return CompletableFuture<SetSqlRuleRankResponse>
     */
    public CompletableFuture<SetSqlRuleRankResponse> setSqlRuleRankAsync(SetSqlRuleRankRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.setSqlRuleRank);
    }

    /**
     * sql规则优先级排序
     *
     * sql规则优先级排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlRuleRankRequest 请求对象
     * @return AsyncInvoker<SetSqlRuleRankRequest, SetSqlRuleRankResponse>
     */
    public AsyncInvoker<SetSqlRuleRankRequest, SetSqlRuleRankResponse> setSqlRuleRankAsyncInvoker(
        SetSqlRuleRankRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.setSqlRuleRank, hcClient);
    }

    /**
     * 编辑sql自定义规则
     *
     * 编辑sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSqlRuleRequest 请求对象
     * @return CompletableFuture<UpdateAuditSqlRuleResponse>
     */
    public CompletableFuture<UpdateAuditSqlRuleResponse> updateAuditSqlRuleAsync(UpdateAuditSqlRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditSqlRule);
    }

    /**
     * 编辑sql自定义规则
     *
     * 编辑sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSqlRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse>
     */
    public AsyncInvoker<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse> updateAuditSqlRuleAsyncInvoker(
        UpdateAuditSqlRuleRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditSqlRule, hcClient);
    }

    /**
     * 修改白名单
     *
     * 修改白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateAuditWhitelistResponse>
     */
    public CompletableFuture<UpdateAuditWhitelistResponse> updateAuditWhitelistAsync(
        UpdateAuditWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.updateAuditWhitelist);
    }

    /**
     * 修改白名单
     *
     * 修改白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse>
     */
    public AsyncInvoker<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse> updateAuditWhitelistAsyncInvoker(
        UpdateAuditWhitelistRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.updateAuditWhitelist, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return CompletableFuture<BatchAddResourceTagResponse>
     */
    public CompletableFuture<BatchAddResourceTagResponse> batchAddResourceTagAsync(BatchAddResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchAddResourceTag);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>
     */
    public AsyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTagAsyncInvoker(
        BatchAddResourceTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchAddResourceTag, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteResourceTagResponse>
     */
    public CompletableFuture<BatchDeleteResourceTagResponse> batchDeleteResourceTagAsync(
        BatchDeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public AsyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagAsyncInvoker(
        BatchDeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return CompletableFuture<CountResourceInstanceByTagResponse>
     */
    public CompletableFuture<CountResourceInstanceByTagResponse> countResourceInstanceByTagAsync(
        CountResourceInstanceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.countResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return AsyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>
     */
    public AsyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTagAsyncInvoker(
        CountResourceInstanceByTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.countResourceInstanceByTag, hcClient);
    }

    /**
     * 获取实例标签
     *
     * 获取实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTagsRequest 请求对象
     * @return CompletableFuture<ListAuditTagsResponse>
     */
    public CompletableFuture<ListAuditTagsResponse> listAuditTagsAsync(ListAuditTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listAuditTags);
    }

    /**
     * 获取实例标签
     *
     * 获取实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTagsRequest 请求对象
     * @return AsyncInvoker<ListAuditTagsRequest, ListAuditTagsResponse>
     */
    public AsyncInvoker<ListAuditTagsRequest, ListAuditTagsResponse> listAuditTagsAsyncInvoker(
        ListAuditTagsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listAuditTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return CompletableFuture<ListProjectResourceTagsResponse>
     */
    public CompletableFuture<ListProjectResourceTagsResponse> listProjectResourceTagsAsync(
        ListProjectResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listProjectResourceTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>
     */
    public AsyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTagsAsyncInvoker(
        ListProjectResourceTagsRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listProjectResourceTags, hcClient);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return CompletableFuture<ListResourceInstanceByTagResponse>
     */
    public CompletableFuture<ListResourceInstanceByTagResponse> listResourceInstanceByTagAsync(
        ListResourceInstanceByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DbssMeta.listResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return AsyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>
     */
    public AsyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTagAsyncInvoker(
        ListResourceInstanceByTagRequest request) {
        return new AsyncInvoker<>(request, DbssMeta.listResourceInstanceByTag, hcClient);
    }

}
