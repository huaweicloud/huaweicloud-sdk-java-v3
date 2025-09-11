package com.huaweicloud.sdk.dbss.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class DbssClient {

    protected HcClient hcClient;

    public DbssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DbssClient> newBuilder() {
        ClientBuilder<DbssClient> clientBuilder = new ClientBuilder<>(DbssClient::new);
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
     * @return AddAuditAgentResponse
     */
    @Deprecated
    public AddAuditAgentResponse addAuditAgent(AddAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditAgent);
    }

    /**
     * 添加审计数据库Agent[待下线]
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentRequest 请求对象
     * @return SyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse>
     */
    @Deprecated
    public SyncInvoker<AddAuditAgentRequest, AddAuditAgentResponse> addAuditAgentInvoker(AddAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditAgent, hcClient);
    }

    /**
     * 添加自建数据库[待下线]
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return AddAuditDatabaseResponse
     */
    @Deprecated
    public AddAuditDatabaseResponse addAuditDatabase(AddAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditDatabase);
    }

    /**
     * 添加自建数据库[待下线]
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseRequest 请求对象
     * @return SyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse>
     */
    @Deprecated
    public SyncInvoker<AddAuditDatabaseRequest, AddAuditDatabaseResponse> addAuditDatabaseInvoker(
        AddAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditDatabase, hcClient);
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseNewRequest 请求对象
     * @return AddAuditDatabaseNewResponse
     */
    public AddAuditDatabaseNewResponse addAuditDatabaseNew(AddAuditDatabaseNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditDatabaseNew);
    }

    /**
     * 添加自建数据库
     *
     * 添加自建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditDatabaseNewRequest 请求对象
     * @return SyncInvoker<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse>
     */
    public SyncInvoker<AddAuditDatabaseNewRequest, AddAuditDatabaseNewResponse> addAuditDatabaseNewInvoker(
        AddAuditDatabaseNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditDatabaseNew, hcClient);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return AddRdsDatabaseResponse
     */
    @Deprecated
    public AddRdsDatabaseResponse addRdsDatabase(AddRdsDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addRdsDatabase);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseRequest 请求对象
     * @return SyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse>
     */
    @Deprecated
    public SyncInvoker<AddRdsDatabaseRequest, AddRdsDatabaseResponse> addRdsDatabaseInvoker(
        AddRdsDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addRdsDatabase, hcClient);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseNewRequest 请求对象
     * @return AddRdsDatabaseNewResponse
     */
    public AddRdsDatabaseNewResponse addRdsDatabaseNew(AddRdsDatabaseNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addRdsDatabaseNew);
    }

    /**
     * 添加RDS数据库
     *
     * 添加RDS数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsDatabaseNewRequest 请求对象
     * @return SyncInvoker<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse>
     */
    public SyncInvoker<AddRdsDatabaseNewRequest, AddRdsDatabaseNewResponse> addRdsDatabaseNewInvoker(
        AddRdsDatabaseNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addRdsDatabaseNew, hcClient);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库。V1版本已不再维护，待下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return AddRdsNoAgentDatabaseResponse
     */
    @Deprecated
    public AddRdsNoAgentDatabaseResponse addRdsNoAgentDatabase(AddRdsNoAgentDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addRdsNoAgentDatabase);
    }

    /**
     * 添加RDS数据库[待下线]
     *
     * 添加RDS数据库。V1版本已不再维护，待下线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRdsNoAgentDatabaseRequest 请求对象
     * @return SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse>
     */
    @Deprecated
    public SyncInvoker<AddRdsNoAgentDatabaseRequest, AddRdsNoAgentDatabaseResponse> addRdsNoAgentDatabaseInvoker(
        AddRdsNoAgentDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addRdsNoAgentDatabase, hcClient);
    }

    /**
     * 审计范围规则操作-删除策略
     *
     * 审计范围规则操作-删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAuditScopeRequest 请求对象
     * @return BatchDeleteAuditScopeResponse
     */
    public BatchDeleteAuditScopeResponse batchDeleteAuditScope(BatchDeleteAuditScopeRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchDeleteAuditScope);
    }

    /**
     * 审计范围规则操作-删除策略
     *
     * 审计范围规则操作-删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAuditScopeRequest 请求对象
     * @return SyncInvoker<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse>
     */
    public SyncInvoker<BatchDeleteAuditScopeRequest, BatchDeleteAuditScopeResponse> batchDeleteAuditScopeInvoker(
        BatchDeleteAuditScopeRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchDeleteAuditScope, hcClient);
    }

    /**
     * 批量标记
     *
     * 批量标记
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAuditAlarmLogStatusRequest 请求对象
     * @return BatchSetAuditAlarmLogStatusResponse
     */
    public BatchSetAuditAlarmLogStatusResponse batchSetAuditAlarmLogStatus(BatchSetAuditAlarmLogStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchSetAuditAlarmLogStatus);
    }

    /**
     * 批量标记
     *
     * 批量标记
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetAuditAlarmLogStatusRequest 请求对象
     * @return SyncInvoker<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse>
     */
    public SyncInvoker<BatchSetAuditAlarmLogStatusRequest, BatchSetAuditAlarmLogStatusResponse> batchSetAuditAlarmLogStatusInvoker(
        BatchSetAuditAlarmLogStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchSetAuditAlarmLogStatus, hcClient);
    }

    /**
     * 绑定数据库加密实例的eip
     *
     * 绑定数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbEncryptEipRequest 请求对象
     * @return BindDbEncryptEipResponse
     */
    public BindDbEncryptEipResponse bindDbEncryptEip(BindDbEncryptEipRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.bindDbEncryptEip);
    }

    /**
     * 绑定数据库加密实例的eip
     *
     * 绑定数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbEncryptEipRequest 请求对象
     * @return SyncInvoker<BindDbEncryptEipRequest, BindDbEncryptEipResponse>
     */
    public SyncInvoker<BindDbEncryptEipRequest, BindDbEncryptEipResponse> bindDbEncryptEipInvoker(
        BindDbEncryptEipRequest request) {
        return new SyncInvoker<>(request, DbssMeta.bindDbEncryptEip, hcClient);
    }

    /**
     * 绑定数据库运维实例的eip
     *
     * 绑定数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbOmEipRequest 请求对象
     * @return BindDbOmEipResponse
     */
    public BindDbOmEipResponse bindDbOmEip(BindDbOmEipRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.bindDbOmEip);
    }

    /**
     * 绑定数据库运维实例的eip
     *
     * 绑定数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDbOmEipRequest 请求对象
     * @return SyncInvoker<BindDbOmEipRequest, BindDbOmEipResponse>
     */
    public SyncInvoker<BindDbOmEipRequest, BindDbOmEipResponse> bindDbOmEipInvoker(BindDbOmEipRequest request) {
        return new SyncInvoker<>(request, DbssMeta.bindDbOmEip, hcClient);
    }

    /**
     * 更改数据库加密实例的安全组
     *
     * 更改数据库加密实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbEncryptSecurityGroupRequest 请求对象
     * @return ChangeDbEncryptSecurityGroupResponse
     */
    public ChangeDbEncryptSecurityGroupResponse changeDbEncryptSecurityGroup(
        ChangeDbEncryptSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.changeDbEncryptSecurityGroup);
    }

    /**
     * 更改数据库加密实例的安全组
     *
     * 更改数据库加密实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbEncryptSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse>
     */
    public SyncInvoker<ChangeDbEncryptSecurityGroupRequest, ChangeDbEncryptSecurityGroupResponse> changeDbEncryptSecurityGroupInvoker(
        ChangeDbEncryptSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DbssMeta.changeDbEncryptSecurityGroup, hcClient);
    }

    /**
     * 更改数据库运维实例的安全组
     *
     * 更改数据库运维实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbOmSecurityGroupRequest 请求对象
     * @return ChangeDbOmSecurityGroupResponse
     */
    public ChangeDbOmSecurityGroupResponse changeDbOmSecurityGroup(ChangeDbOmSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.changeDbOmSecurityGroup);
    }

    /**
     * 更改数据库运维实例的安全组
     *
     * 更改数据库运维实例的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDbOmSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse>
     */
    public SyncInvoker<ChangeDbOmSecurityGroupRequest, ChangeDbOmSecurityGroupResponse> changeDbOmSecurityGroupInvoker(
        ChangeDbOmSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DbssMeta.changeDbOmSecurityGroup, hcClient);
    }

    /**
     * 触发审计实例升级
     *
     * 触发审计实例升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUpgradeAuditRequest 请求对象
     * @return ConfirmUpgradeAuditResponse
     */
    public ConfirmUpgradeAuditResponse confirmUpgradeAudit(ConfirmUpgradeAuditRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.confirmUpgradeAudit);
    }

    /**
     * 触发审计实例升级
     *
     * 触发审计实例升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUpgradeAuditRequest 请求对象
     * @return SyncInvoker<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse>
     */
    public SyncInvoker<ConfirmUpgradeAuditRequest, ConfirmUpgradeAuditResponse> confirmUpgradeAuditInvoker(
        ConfirmUpgradeAuditRequest request) {
        return new SyncInvoker<>(request, DbssMeta.confirmUpgradeAudit, hcClient);
    }

    /**
     * 查询数据库用户会话分布
     *
     * 查询数据库用户会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbAccountSessionRequest 请求对象
     * @return CountDbAccountSessionResponse
     */
    public CountDbAccountSessionResponse countDbAccountSession(CountDbAccountSessionRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countDbAccountSession);
    }

    /**
     * 查询数据库用户会话分布
     *
     * 查询数据库用户会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbAccountSessionRequest 请求对象
     * @return SyncInvoker<CountDbAccountSessionRequest, CountDbAccountSessionResponse>
     */
    public SyncInvoker<CountDbAccountSessionRequest, CountDbAccountSessionResponse> countDbAccountSessionInvoker(
        CountDbAccountSessionRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countDbAccountSession, hcClient);
    }

    /**
     * 查询客户端会话分布
     *
     * 查询客户端会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbClientSessionRequest 请求对象
     * @return CountDbClientSessionResponse
     */
    public CountDbClientSessionResponse countDbClientSession(CountDbClientSessionRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countDbClientSession);
    }

    /**
     * 查询客户端会话分布
     *
     * 查询客户端会话分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountDbClientSessionRequest 请求对象
     * @return SyncInvoker<CountDbClientSessionRequest, CountDbClientSessionResponse>
     */
    public SyncInvoker<CountDbClientSessionRequest, CountDbClientSessionResponse> countDbClientSessionInvoker(
        CountDbClientSessionRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countDbClientSession, hcClient);
    }

    /**
     * 获取指定时间段内的sql注入分布统计
     *
     * 获取指定时间段内的sql注入分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInjectionStatisticsRequest 请求对象
     * @return CountInjectionStatisticsResponse
     */
    public CountInjectionStatisticsResponse countInjectionStatistics(CountInjectionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countInjectionStatistics);
    }

    /**
     * 获取指定时间段内的sql注入分布统计
     *
     * 获取指定时间段内的sql注入分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountInjectionStatisticsRequest 请求对象
     * @return SyncInvoker<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse>
     */
    public SyncInvoker<CountInjectionStatisticsRequest, CountInjectionStatisticsResponse> countInjectionStatisticsInvoker(
        CountInjectionStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countInjectionStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的风险操作数量分布统计
     *
     * 获取指定时间段内的风险操作数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOperationStatisticsRequest 请求对象
     * @return CountOperationStatisticsResponse
     */
    public CountOperationStatisticsResponse countOperationStatistics(CountOperationStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countOperationStatistics);
    }

    /**
     * 获取指定时间段内的风险操作数量分布统计
     *
     * 获取指定时间段内的风险操作数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountOperationStatisticsRequest 请求对象
     * @return SyncInvoker<CountOperationStatisticsRequest, CountOperationStatisticsResponse>
     */
    public SyncInvoker<CountOperationStatisticsRequest, CountOperationStatisticsResponse> countOperationStatisticsInvoker(
        CountOperationStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countOperationStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的风险分布统计
     *
     * 获取指定时间段内的风险分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountRiskTrendStatisticsRequest 请求对象
     * @return CountRiskTrendStatisticsResponse
     */
    public CountRiskTrendStatisticsResponse countRiskTrendStatistics(CountRiskTrendStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countRiskTrendStatistics);
    }

    /**
     * 获取指定时间段内的风险分布统计
     *
     * 获取指定时间段内的风险分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountRiskTrendStatisticsRequest 请求对象
     * @return SyncInvoker<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse>
     */
    public SyncInvoker<CountRiskTrendStatisticsRequest, CountRiskTrendStatisticsResponse> countRiskTrendStatisticsInvoker(
        CountRiskTrendStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countRiskTrendStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的查询会话统计
     *
     * 获取指定时间段内的查询会话统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSessionStatisticsRequest 请求对象
     * @return CountSessionStatisticsResponse
     */
    public CountSessionStatisticsResponse countSessionStatistics(CountSessionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countSessionStatistics);
    }

    /**
     * 获取指定时间段内的查询会话统计
     *
     * 获取指定时间段内的查询会话统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSessionStatisticsRequest 请求对象
     * @return SyncInvoker<CountSessionStatisticsRequest, CountSessionStatisticsResponse>
     */
    public SyncInvoker<CountSessionStatisticsRequest, CountSessionStatisticsResponse> countSessionStatisticsInvoker(
        CountSessionStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countSessionStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的SQL分布统计
     *
     * 获取指定时间段内的SQL分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlStatisticsRequest 请求对象
     * @return CountSqlStatisticsResponse
     */
    public CountSqlStatisticsResponse countSqlStatistics(CountSqlStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countSqlStatistics);
    }

    /**
     * 获取指定时间段内的SQL分布统计
     *
     * 获取指定时间段内的SQL分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlStatisticsRequest 请求对象
     * @return SyncInvoker<CountSqlStatisticsRequest, CountSqlStatisticsResponse>
     */
    public SyncInvoker<CountSqlStatisticsRequest, CountSqlStatisticsResponse> countSqlStatisticsInvoker(
        CountSqlStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countSqlStatistics, hcClient);
    }

    /**
     * 获取指定时间段内的sql数量分布统计
     *
     * 获取指定时间段内的sql数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlTrendStatisticsRequest 请求对象
     * @return CountSqlTrendStatisticsResponse
     */
    public CountSqlTrendStatisticsResponse countSqlTrendStatistics(CountSqlTrendStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countSqlTrendStatistics);
    }

    /**
     * 获取指定时间段内的sql数量分布统计
     *
     * 获取指定时间段内的sql数量分布统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSqlTrendStatisticsRequest 请求对象
     * @return SyncInvoker<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse>
     */
    public SyncInvoker<CountSqlTrendStatisticsRequest, CountSqlTrendStatisticsResponse> countSqlTrendStatisticsInvoker(
        CountSqlTrendStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countSqlTrendStatistics, hcClient);
    }

    /**
     * 添加风险规则
     *
     * 添加风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditRiskRuleRequest 请求对象
     * @return CreateAuditRiskRuleResponse
     */
    public CreateAuditRiskRuleResponse createAuditRiskRule(CreateAuditRiskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createAuditRiskRule);
    }

    /**
     * 添加风险规则
     *
     * 添加风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditRiskRuleRequest 请求对象
     * @return SyncInvoker<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse>
     */
    public SyncInvoker<CreateAuditRiskRuleRequest, CreateAuditRiskRuleResponse> createAuditRiskRuleInvoker(
        CreateAuditRiskRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createAuditRiskRule, hcClient);
    }

    /**
     * 添加审计范围策略
     *
     * 添加审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditScopeRuleRequest 请求对象
     * @return CreateAuditScopeRuleResponse
     */
    public CreateAuditScopeRuleResponse createAuditScopeRule(CreateAuditScopeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createAuditScopeRule);
    }

    /**
     * 添加审计范围策略
     *
     * 添加审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditScopeRuleRequest 请求对象
     * @return SyncInvoker<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse>
     */
    public SyncInvoker<CreateAuditScopeRuleRequest, CreateAuditScopeRuleResponse> createAuditScopeRuleInvoker(
        CreateAuditScopeRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createAuditScopeRule, hcClient);
    }

    /**
     * 按包周期方式购买数据库加密实例
     *
     * 按需方式购买数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbEncryptInstancePeriodRequest 请求对象
     * @return CreateDbEncryptInstancePeriodResponse
     */
    public CreateDbEncryptInstancePeriodResponse createDbEncryptInstancePeriod(
        CreateDbEncryptInstancePeriodRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createDbEncryptInstancePeriod);
    }

    /**
     * 按包周期方式购买数据库加密实例
     *
     * 按需方式购买数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbEncryptInstancePeriodRequest 请求对象
     * @return SyncInvoker<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse>
     */
    public SyncInvoker<CreateDbEncryptInstancePeriodRequest, CreateDbEncryptInstancePeriodResponse> createDbEncryptInstancePeriodInvoker(
        CreateDbEncryptInstancePeriodRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createDbEncryptInstancePeriod, hcClient);
    }

    /**
     * 包周期购买数据库运维实例
     *
     * 包周期购买数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbOmInstancePeriodRequest 请求对象
     * @return CreateDbOmInstancePeriodResponse
     */
    public CreateDbOmInstancePeriodResponse createDbOmInstancePeriod(CreateDbOmInstancePeriodRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createDbOmInstancePeriod);
    }

    /**
     * 包周期购买数据库运维实例
     *
     * 包周期购买数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbOmInstancePeriodRequest 请求对象
     * @return SyncInvoker<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse>
     */
    public SyncInvoker<CreateDbOmInstancePeriodRequest, CreateDbOmInstancePeriodResponse> createDbOmInstancePeriodInvoker(
        CreateDbOmInstancePeriodRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createDbOmInstancePeriod, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例[待下线]
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return CreateInstancesPeriodOrderResponse
     */
    @Deprecated
    public CreateInstancesPeriodOrderResponse createInstancesPeriodOrder(CreateInstancesPeriodOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createInstancesPeriodOrder);
    }

    /**
     * 包年包月计费模式创建审计实例[待下线]
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderRequest 请求对象
     * @return SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse>
     */
    @Deprecated
    public SyncInvoker<CreateInstancesPeriodOrderRequest, CreateInstancesPeriodOrderResponse> createInstancesPeriodOrderInvoker(
        CreateInstancesPeriodOrderRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createInstancesPeriodOrder, hcClient);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderNewRequest 请求对象
     * @return CreateInstancesPeriodOrderNewResponse
     */
    public CreateInstancesPeriodOrderNewResponse createInstancesPeriodOrderNew(
        CreateInstancesPeriodOrderNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createInstancesPeriodOrderNew);
    }

    /**
     * 包年包月计费模式创建审计实例
     *
     * 包年包月计费模式创建审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstancesPeriodOrderNewRequest 请求对象
     * @return SyncInvoker<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse>
     */
    public SyncInvoker<CreateInstancesPeriodOrderNewRequest, CreateInstancesPeriodOrderNewResponse> createInstancesPeriodOrderNewInvoker(
        CreateInstancesPeriodOrderNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createInstancesPeriodOrderNew, hcClient);
    }

    /**
     * 立即生成报表
     *
     * 立即生成报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CreateReportResponse
     */
    public CreateReportResponse createReport(CreateReportRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createReport);
    }

    /**
     * 立即生成报表
     *
     * 立即生成报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return SyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public SyncInvoker<CreateReportRequest, CreateReportResponse> createReportInvoker(CreateReportRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createReport, hcClient);
    }

    /**
     * 增加隐私数据脱敏规则
     *
     * 增加隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSensitiveMaskRuleRequest 请求对象
     * @return CreateSensitiveMaskRuleResponse
     */
    public CreateSensitiveMaskRuleResponse createSensitiveMaskRule(CreateSensitiveMaskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createSensitiveMaskRule);
    }

    /**
     * 增加隐私数据脱敏规则
     *
     * 增加隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSensitiveMaskRuleRequest 请求对象
     * @return SyncInvoker<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse>
     */
    public SyncInvoker<CreateSensitiveMaskRuleRequest, CreateSensitiveMaskRuleResponse> createSensitiveMaskRuleInvoker(
        CreateSensitiveMaskRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createSensitiveMaskRule, hcClient);
    }

    /**
     * 删除数据库Agent[待下线]
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return DeleteAuditAgentResponse
     */
    @Deprecated
    public DeleteAuditAgentResponse deleteAuditAgent(DeleteAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditAgent);
    }

    /**
     * 删除数据库Agent[待下线]
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentRequest 请求对象
     * @return SyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteAuditAgentRequest, DeleteAuditAgentResponse> deleteAuditAgentInvoker(
        DeleteAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditAgent, hcClient);
    }

    /**
     * 删除告警监控记录
     *
     * 删除告警监控记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAlarmLogRequest 请求对象
     * @return DeleteAuditAlarmLogResponse
     */
    public DeleteAuditAlarmLogResponse deleteAuditAlarmLog(DeleteAuditAlarmLogRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditAlarmLog);
    }

    /**
     * 删除告警监控记录
     *
     * 删除告警监控记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAlarmLogRequest 请求对象
     * @return SyncInvoker<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse>
     */
    public SyncInvoker<DeleteAuditAlarmLogRequest, DeleteAuditAlarmLogResponse> deleteAuditAlarmLogInvoker(
        DeleteAuditAlarmLogRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditAlarmLog, hcClient);
    }

    /**
     * 删除指定备份任务
     *
     * 删除指定备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditBackupTaskRequest 请求对象
     * @return DeleteAuditBackupTaskResponse
     */
    public DeleteAuditBackupTaskResponse deleteAuditBackupTask(DeleteAuditBackupTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditBackupTask);
    }

    /**
     * 删除指定备份任务
     *
     * 删除指定备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditBackupTaskRequest 请求对象
     * @return SyncInvoker<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse>
     */
    public SyncInvoker<DeleteAuditBackupTaskRequest, DeleteAuditBackupTaskResponse> deleteAuditBackupTaskInvoker(
        DeleteAuditBackupTaskRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditBackupTask, hcClient);
    }

    /**
     * 删除数据库[待下线]
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return DeleteAuditDatabaseResponse
     */
    @Deprecated
    public DeleteAuditDatabaseResponse deleteAuditDatabase(DeleteAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditDatabase);
    }

    /**
     * 删除数据库[待下线]
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteAuditDatabaseRequest, DeleteAuditDatabaseResponse> deleteAuditDatabaseInvoker(
        DeleteAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseNewRequest 请求对象
     * @return DeleteAuditDatabaseNewResponse
     */
    public DeleteAuditDatabaseNewResponse deleteAuditDatabaseNew(DeleteAuditDatabaseNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditDatabaseNew);
    }

    /**
     * 删除数据库
     *
     * 删除数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditDatabaseNewRequest 请求对象
     * @return SyncInvoker<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse>
     */
    public SyncInvoker<DeleteAuditDatabaseNewRequest, DeleteAuditDatabaseNewResponse> deleteAuditDatabaseNewInvoker(
        DeleteAuditDatabaseNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditDatabaseNew, hcClient);
    }

    /**
     * 删除报表
     *
     * 删除报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditReportRequest 请求对象
     * @return DeleteAuditReportResponse
     */
    public DeleteAuditReportResponse deleteAuditReport(DeleteAuditReportRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditReport);
    }

    /**
     * 删除报表
     *
     * 删除报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditReportRequest 请求对象
     * @return SyncInvoker<DeleteAuditReportRequest, DeleteAuditReportResponse>
     */
    public SyncInvoker<DeleteAuditReportRequest, DeleteAuditReportResponse> deleteAuditReportInvoker(
        DeleteAuditReportRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditReport, hcClient);
    }

    /**
     * 删除风险策略
     *
     * 删除风险策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleRiskRequest 请求对象
     * @return DeleteAuditRuleRiskResponse
     */
    public DeleteAuditRuleRiskResponse deleteAuditRuleRisk(DeleteAuditRuleRiskRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditRuleRisk);
    }

    /**
     * 删除风险策略
     *
     * 删除风险策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleRiskRequest 请求对象
     * @return SyncInvoker<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse>
     */
    public SyncInvoker<DeleteAuditRuleRiskRequest, DeleteAuditRuleRiskResponse> deleteAuditRuleRiskInvoker(
        DeleteAuditRuleRiskRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditRuleRisk, hcClient);
    }

    /**
     * 删除审计范围策略
     *
     * 删除审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditScopeRequest 请求对象
     * @return DeleteAuditScopeResponse
     */
    public DeleteAuditScopeResponse deleteAuditScope(DeleteAuditScopeRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditScope);
    }

    /**
     * 删除审计范围策略
     *
     * 删除审计范围策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditScopeRequest 请求对象
     * @return SyncInvoker<DeleteAuditScopeRequest, DeleteAuditScopeResponse>
     */
    public SyncInvoker<DeleteAuditScopeRequest, DeleteAuditScopeResponse> deleteAuditScopeInvoker(
        DeleteAuditScopeRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditScope, hcClient);
    }

    /**
     * 删除数据库加密实例
     *
     * 删除数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbEncryptInstanceRequest 请求对象
     * @return DeleteDbEncryptInstanceResponse
     */
    public DeleteDbEncryptInstanceResponse deleteDbEncryptInstance(DeleteDbEncryptInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteDbEncryptInstance);
    }

    /**
     * 删除数据库加密实例
     *
     * 删除数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbEncryptInstanceRequest 请求对象
     * @return SyncInvoker<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse>
     */
    public SyncInvoker<DeleteDbEncryptInstanceRequest, DeleteDbEncryptInstanceResponse> deleteDbEncryptInstanceInvoker(
        DeleteDbEncryptInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteDbEncryptInstance, hcClient);
    }

    /**
     * 删除数据库运维实例
     *
     * 删除数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbOmInstanceRequest 请求对象
     * @return DeleteDbOmInstanceResponse
     */
    public DeleteDbOmInstanceResponse deleteDbOmInstance(DeleteDbOmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteDbOmInstance);
    }

    /**
     * 删除数据库运维实例
     *
     * 删除数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbOmInstanceRequest 请求对象
     * @return SyncInvoker<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse>
     */
    public SyncInvoker<DeleteDbOmInstanceRequest, DeleteDbOmInstanceResponse> deleteDbOmInstanceInvoker(
        DeleteDbOmInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteDbOmInstance, hcClient);
    }

    /**
     * 删除审计实例[待下线]
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return DeleteInstancesResponse
     */
    @Deprecated
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteInstances);
    }

    /**
     * 删除审计实例[待下线]
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesRequest 请求对象
     * @return SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteInstancesRequest, DeleteInstancesResponse> deleteInstancesInvoker(
        DeleteInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteInstances, hcClient);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesNewRequest 请求对象
     * @return DeleteInstancesNewResponse
     */
    public DeleteInstancesNewResponse deleteInstancesNew(DeleteInstancesNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteInstancesNew);
    }

    /**
     * 删除审计实例
     *
     * 只有按需计费模式实例没有任务时 或 包周期模式实例状态为故障时，才能执行此操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesNewRequest 请求对象
     * @return SyncInvoker<DeleteInstancesNewRequest, DeleteInstancesNewResponse>
     */
    public SyncInvoker<DeleteInstancesNewRequest, DeleteInstancesNewResponse> deleteInstancesNewInvoker(
        DeleteInstancesNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteInstancesNew, hcClient);
    }

    /**
     * 删除隐私数据脱敏规则
     *
     * 删除隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSensitiveRulesRequest 请求对象
     * @return DeleteSensitiveRulesResponse
     */
    public DeleteSensitiveRulesResponse deleteSensitiveRules(DeleteSensitiveRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteSensitiveRules);
    }

    /**
     * 删除隐私数据脱敏规则
     *
     * 删除隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSensitiveRulesRequest 请求对象
     * @return SyncInvoker<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse>
     */
    public SyncInvoker<DeleteSensitiveRulesRequest, DeleteSensitiveRulesResponse> deleteSensitiveRulesInvoker(
        DeleteSensitiveRulesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteSensitiveRules, hcClient);
    }

    /**
     * 下载审计Agent[待下线]
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return DownloadAuditAgentResponse
     */
    @Deprecated
    public DownloadAuditAgentResponse downloadAuditAgent(DownloadAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.downloadAuditAgent);
    }

    /**
     * 下载审计Agent[待下线]
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentRequest 请求对象
     * @return SyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse>
     */
    @Deprecated
    public SyncInvoker<DownloadAuditAgentRequest, DownloadAuditAgentResponse> downloadAuditAgentInvoker(
        DownloadAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.downloadAuditAgent, hcClient);
    }

    /**
     * 下载报表
     *
     * 下载报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditReportRequest 请求对象
     * @return DownloadAuditReportResponse
     */
    public DownloadAuditReportResponse downloadAuditReport(DownloadAuditReportRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.downloadAuditReport);
    }

    /**
     * 下载报表
     *
     * 下载报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditReportRequest 请求对象
     * @return SyncInvoker<DownloadAuditReportRequest, DownloadAuditReportResponse>
     */
    public SyncInvoker<DownloadAuditReportRequest, DownloadAuditReportResponse> downloadAuditReportInvoker(
        DownloadAuditReportRequest request) {
        return new SyncInvoker<>(request, DbssMeta.downloadAuditReport, hcClient);
    }

    /**
     * 获取实例告警配置[待下线]
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return ListAlarmTopicConfigInfoResponse
     */
    @Deprecated
    public ListAlarmTopicConfigInfoResponse listAlarmTopicConfigInfo(ListAlarmTopicConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAlarmTopicConfigInfo);
    }

    /**
     * 获取实例告警配置[待下线]
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoRequest 请求对象
     * @return SyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public SyncInvoker<ListAlarmTopicConfigInfoRequest, ListAlarmTopicConfigInfoResponse> listAlarmTopicConfigInfoInvoker(
        ListAlarmTopicConfigInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoNewRequest 请求对象
     * @return ListAlarmTopicConfigInfoNewResponse
     */
    public ListAlarmTopicConfigInfoNewResponse listAlarmTopicConfigInfoNew(ListAlarmTopicConfigInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAlarmTopicConfigInfoNew);
    }

    /**
     * 获取实例告警配置
     *
     * 获取实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmTopicConfigInfoNewRequest 请求对象
     * @return SyncInvoker<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse>
     */
    public SyncInvoker<ListAlarmTopicConfigInfoNewRequest, ListAlarmTopicConfigInfoNewResponse> listAlarmTopicConfigInfoNewInvoker(
        ListAlarmTopicConfigInfoNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAlarmTopicConfigInfoNew, hcClient);
    }

    /**
     * 查询数据库Agent列表[待下线]
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return ListAuditAgentResponse
     */
    @Deprecated
    public ListAuditAgentResponse listAuditAgent(ListAuditAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAgent);
    }

    /**
     * 查询数据库Agent列表[待下线]
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentRequest 请求对象
     * @return SyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditAgentRequest, ListAuditAgentResponse> listAuditAgentInvoker(
        ListAuditAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAgent, hcClient);
    }

    /**
     * 查询审计告警信息[待下线]
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return ListAuditAlarmLogResponse
     */
    @Deprecated
    public ListAuditAlarmLogResponse listAuditAlarmLog(ListAuditAlarmLogRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAlarmLog);
    }

    /**
     * 查询审计告警信息[待下线]
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogRequest 请求对象
     * @return SyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditAlarmLogRequest, ListAuditAlarmLogResponse> listAuditAlarmLogInvoker(
        ListAuditAlarmLogRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAlarmLog, hcClient);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogNewRequest 请求对象
     * @return ListAuditAlarmLogNewResponse
     */
    public ListAuditAlarmLogNewResponse listAuditAlarmLogNew(ListAuditAlarmLogNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAlarmLogNew);
    }

    /**
     * 查询审计告警信息
     *
     * 查询审计告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAlarmLogNewRequest 请求对象
     * @return SyncInvoker<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse>
     */
    public SyncInvoker<ListAuditAlarmLogNewRequest, ListAuditAlarmLogNewResponse> listAuditAlarmLogNewInvoker(
        ListAuditAlarmLogNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAlarmLogNew, hcClient);
    }

    /**
     * 获取所有备份信息
     *
     * 获取所有备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupInfoRequest 请求对象
     * @return ListAuditBackupInfoResponse
     */
    public ListAuditBackupInfoResponse listAuditBackupInfo(ListAuditBackupInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditBackupInfo);
    }

    /**
     * 获取所有备份信息
     *
     * 获取所有备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupInfoRequest 请求对象
     * @return SyncInvoker<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse>
     */
    public SyncInvoker<ListAuditBackupInfoRequest, ListAuditBackupInfoResponse> listAuditBackupInfoInvoker(
        ListAuditBackupInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditBackupInfo, hcClient);
    }

    /**
     * 获取风险导出配置列表
     *
     * 获取风险导出配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupRiskTemplatesRequest 请求对象
     * @return ListAuditBackupRiskTemplatesResponse
     */
    public ListAuditBackupRiskTemplatesResponse listAuditBackupRiskTemplates(
        ListAuditBackupRiskTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditBackupRiskTemplates);
    }

    /**
     * 获取风险导出配置列表
     *
     * 获取风险导出配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditBackupRiskTemplatesRequest 请求对象
     * @return SyncInvoker<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse>
     */
    public SyncInvoker<ListAuditBackupRiskTemplatesRequest, ListAuditBackupRiskTemplatesResponse> listAuditBackupRiskTemplatesInvoker(
        ListAuditBackupRiskTemplatesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditBackupRiskTemplates, hcClient);
    }

    /**
     * 查询数据库列表[待下线]
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return ListAuditDatabasesResponse
     */
    @Deprecated
    public ListAuditDatabasesResponse listAuditDatabases(ListAuditDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditDatabases);
    }

    /**
     * 查询数据库列表[待下线]
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditDatabasesRequest, ListAuditDatabasesResponse> listAuditDatabasesInvoker(
        ListAuditDatabasesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditDatabases, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesNewRequest 请求对象
     * @return ListAuditDatabasesNewResponse
     */
    public ListAuditDatabasesNewResponse listAuditDatabasesNew(ListAuditDatabasesNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditDatabasesNew);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditDatabasesNewRequest 请求对象
     * @return SyncInvoker<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse>
     */
    public SyncInvoker<ListAuditDatabasesNewRequest, ListAuditDatabasesNewResponse> listAuditDatabasesNewInvoker(
        ListAuditDatabasesNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditDatabasesNew, hcClient);
    }

    /**
     * 查询实例创建任务信息[待下线]
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return ListAuditInstanceJobsResponse
     */
    @Deprecated
    public ListAuditInstanceJobsResponse listAuditInstanceJobs(ListAuditInstanceJobsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstanceJobs);
    }

    /**
     * 查询实例创建任务信息[待下线]
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsRequest 请求对象
     * @return SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditInstanceJobsRequest, ListAuditInstanceJobsResponse> listAuditInstanceJobsInvoker(
        ListAuditInstanceJobsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstanceJobs, hcClient);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsNewRequest 请求对象
     * @return ListAuditInstanceJobsNewResponse
     */
    public ListAuditInstanceJobsNewResponse listAuditInstanceJobsNew(ListAuditInstanceJobsNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstanceJobsNew);
    }

    /**
     * 查询实例创建任务信息
     *
     * 查询实例创建任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstanceJobsNewRequest 请求对象
     * @return SyncInvoker<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse>
     */
    public SyncInvoker<ListAuditInstanceJobsNewRequest, ListAuditInstanceJobsNewResponse> listAuditInstanceJobsNewInvoker(
        ListAuditInstanceJobsNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstanceJobsNew, hcClient);
    }

    /**
     * 查询审计实例列表[待下线]
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return ListAuditInstancesResponse
     */
    @Deprecated
    public ListAuditInstancesResponse listAuditInstances(ListAuditInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstances);
    }

    /**
     * 查询审计实例列表[待下线]
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesRequest 请求对象
     * @return SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditInstancesRequest, ListAuditInstancesResponse> listAuditInstancesInvoker(
        ListAuditInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstances, hcClient);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesNewRequest 请求对象
     * @return ListAuditInstancesNewResponse
     */
    public ListAuditInstancesNewResponse listAuditInstancesNew(ListAuditInstancesNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditInstancesNew);
    }

    /**
     * 查询审计实例列表
     *
     * 查询审计实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditInstancesNewRequest 请求对象
     * @return SyncInvoker<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse>
     */
    public SyncInvoker<ListAuditInstancesNewRequest, ListAuditInstancesNewResponse> listAuditInstancesNewInvoker(
        ListAuditInstancesNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditInstancesNew, hcClient);
    }

    /**
     * 备份或风险导出时，选择obs桶
     *
     * 备份或风险导出时，选择obs桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditObsBucketsRequest 请求对象
     * @return ListAuditObsBucketsResponse
     */
    public ListAuditObsBucketsResponse listAuditObsBuckets(ListAuditObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditObsBuckets);
    }

    /**
     * 备份或风险导出时，选择obs桶
     *
     * 备份或风险导出时，选择obs桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditObsBucketsRequest 请求对象
     * @return SyncInvoker<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse>
     */
    public SyncInvoker<ListAuditObsBucketsRequest, ListAuditObsBucketsResponse> listAuditObsBucketsInvoker(
        ListAuditObsBucketsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditObsBuckets, hcClient);
    }

    /**
     * 查询用户操作日志信息[待下线]
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return ListAuditOperateLogsResponse
     */
    @Deprecated
    public ListAuditOperateLogsResponse listAuditOperateLogs(ListAuditOperateLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditOperateLogs);
    }

    /**
     * 查询用户操作日志信息[待下线]
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsRequest 请求对象
     * @return SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditOperateLogsRequest, ListAuditOperateLogsResponse> listAuditOperateLogsInvoker(
        ListAuditOperateLogsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditOperateLogs, hcClient);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsNewRequest 请求对象
     * @return ListAuditOperateLogsNewResponse
     */
    public ListAuditOperateLogsNewResponse listAuditOperateLogsNew(ListAuditOperateLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditOperateLogsNew);
    }

    /**
     * 查询用户操作日志信息
     *
     * 查询用户操作日志信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditOperateLogsNewRequest 请求对象
     * @return SyncInvoker<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse>
     */
    public SyncInvoker<ListAuditOperateLogsNewRequest, ListAuditOperateLogsNewResponse> listAuditOperateLogsNewInvoker(
        ListAuditOperateLogsNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditOperateLogsNew, hcClient);
    }

    /**
     * 获取报表模板
     *
     * 获取报表模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportTemplatesRequest 请求对象
     * @return ListAuditReportTemplatesResponse
     */
    public ListAuditReportTemplatesResponse listAuditReportTemplates(ListAuditReportTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditReportTemplates);
    }

    /**
     * 获取报表模板
     *
     * 获取报表模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportTemplatesRequest 请求对象
     * @return SyncInvoker<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse>
     */
    public SyncInvoker<ListAuditReportTemplatesRequest, ListAuditReportTemplatesResponse> listAuditReportTemplatesInvoker(
        ListAuditReportTemplatesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditReportTemplates, hcClient);
    }

    /**
     * 查询报表
     *
     * 查询报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportsRequest 请求对象
     * @return ListAuditReportsResponse
     */
    public ListAuditReportsResponse listAuditReports(ListAuditReportsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditReports);
    }

    /**
     * 查询报表
     *
     * 查询报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditReportsRequest 请求对象
     * @return SyncInvoker<ListAuditReportsRequest, ListAuditReportsResponse>
     */
    public SyncInvoker<ListAuditReportsRequest, ListAuditReportsResponse> listAuditReportsInvoker(
        ListAuditReportsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditReports, hcClient);
    }

    /**
     * 查询风险规则策略[待下线]
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return ListAuditRuleRisksResponse
     */
    @Deprecated
    public ListAuditRuleRisksResponse listAuditRuleRisks(ListAuditRuleRisksRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleRisks);
    }

    /**
     * 查询风险规则策略[待下线]
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksRequest 请求对象
     * @return SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditRuleRisksRequest, ListAuditRuleRisksResponse> listAuditRuleRisksInvoker(
        ListAuditRuleRisksRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleRisks, hcClient);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksNewRequest 请求对象
     * @return ListAuditRuleRisksNewResponse
     */
    public ListAuditRuleRisksNewResponse listAuditRuleRisksNew(ListAuditRuleRisksNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleRisksNew);
    }

    /**
     * 查询风险规则策略
     *
     * 查询风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleRisksNewRequest 请求对象
     * @return SyncInvoker<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse>
     */
    public SyncInvoker<ListAuditRuleRisksNewRequest, ListAuditRuleRisksNewResponse> listAuditRuleRisksNewInvoker(
        ListAuditRuleRisksNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleRisksNew, hcClient);
    }

    /**
     * 查询审计范围策略列表[待下线]
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return ListAuditRuleScopesResponse
     */
    @Deprecated
    public ListAuditRuleScopesResponse listAuditRuleScopes(ListAuditRuleScopesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleScopes);
    }

    /**
     * 查询审计范围策略列表[待下线]
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesRequest 请求对象
     * @return SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditRuleScopesRequest, ListAuditRuleScopesResponse> listAuditRuleScopesInvoker(
        ListAuditRuleScopesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleScopes, hcClient);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesNewRequest 请求对象
     * @return ListAuditRuleScopesNewResponse
     */
    public ListAuditRuleScopesNewResponse listAuditRuleScopesNew(ListAuditRuleScopesNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditRuleScopesNew);
    }

    /**
     * 查询审计范围策略列表
     *
     * 查询审计范围策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditRuleScopesNewRequest 请求对象
     * @return SyncInvoker<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse>
     */
    public SyncInvoker<ListAuditRuleScopesNewRequest, ListAuditRuleScopesNewResponse> listAuditRuleScopesNewInvoker(
        ListAuditRuleScopesNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditRuleScopesNew, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则[待下线]
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return ListAuditSensitiveMasksResponse
     */
    @Deprecated
    public ListAuditSensitiveMasksResponse listAuditSensitiveMasks(ListAuditSensitiveMasksRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSensitiveMasks);
    }

    /**
     * 查询隐私数据脱敏规则[待下线]
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksRequest 请求对象
     * @return SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditSensitiveMasksRequest, ListAuditSensitiveMasksResponse> listAuditSensitiveMasksInvoker(
        ListAuditSensitiveMasksRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSensitiveMasks, hcClient);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksNewRequest 请求对象
     * @return ListAuditSensitiveMasksNewResponse
     */
    public ListAuditSensitiveMasksNewResponse listAuditSensitiveMasksNew(ListAuditSensitiveMasksNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSensitiveMasksNew);
    }

    /**
     * 查询隐私数据脱敏规则
     *
     * 查询隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSensitiveMasksNewRequest 请求对象
     * @return SyncInvoker<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse>
     */
    public SyncInvoker<ListAuditSensitiveMasksNewRequest, ListAuditSensitiveMasksNewResponse> listAuditSensitiveMasksNewInvoker(
        ListAuditSensitiveMasksNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSensitiveMasksNew, hcClient);
    }

    /**
     * 查询审计SQL语句[待下线]
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return ListAuditSqlsResponse
     */
    @Deprecated
    public ListAuditSqlsResponse listAuditSqls(ListAuditSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSqls);
    }

    /**
     * 查询审计SQL语句[待下线]
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsRequest 请求对象
     * @return SyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse>
     */
    @Deprecated
    public SyncInvoker<ListAuditSqlsRequest, ListAuditSqlsResponse> listAuditSqlsInvoker(ListAuditSqlsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSqls, hcClient);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsNewRequest 请求对象
     * @return ListAuditSqlsNewResponse
     */
    public ListAuditSqlsNewResponse listAuditSqlsNew(ListAuditSqlsNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSqlsNew);
    }

    /**
     * 查询审计SQL语句
     *
     * 查询审计SQL语句
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSqlsNewRequest 请求对象
     * @return SyncInvoker<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse>
     */
    public SyncInvoker<ListAuditSqlsNewRequest, ListAuditSqlsNewResponse> listAuditSqlsNewInvoker(
        ListAuditSqlsNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSqlsNew, hcClient);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return ListAuditSummaryInfosResponse
     */
    public ListAuditSummaryInfosResponse listAuditSummaryInfos(ListAuditSummaryInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditSummaryInfos);
    }

    /**
     * 查询审计汇总信息
     *
     * 查询审计汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditSummaryInfosRequest 请求对象
     * @return SyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse>
     */
    public SyncInvoker<ListAuditSummaryInfosRequest, ListAuditSummaryInfosResponse> listAuditSummaryInfosInvoker(
        ListAuditSummaryInfosRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditSummaryInfos, hcClient);
    }

    /**
     * 查询趋势历史数据
     *
     * 查询趋势历史数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTrendHistoryRequest 请求对象
     * @return ListAuditTrendHistoryResponse
     */
    public ListAuditTrendHistoryResponse listAuditTrendHistory(ListAuditTrendHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditTrendHistory);
    }

    /**
     * 查询趋势历史数据
     *
     * 查询趋势历史数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTrendHistoryRequest 请求对象
     * @return SyncInvoker<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse>
     */
    public SyncInvoker<ListAuditTrendHistoryRequest, ListAuditTrendHistoryResponse> listAuditTrendHistoryInvoker(
        ListAuditTrendHistoryRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditTrendHistory, hcClient);
    }

    /**
     * 查询可用区信息[待下线]
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return ListAvailabilityZoneInfosResponse
     */
    @Deprecated
    public ListAvailabilityZoneInfosResponse listAvailabilityZoneInfos(ListAvailabilityZoneInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfos);
    }

    /**
     * 查询可用区信息[待下线]
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse>
     */
    @Deprecated
    public SyncInvoker<ListAvailabilityZoneInfosRequest, ListAvailabilityZoneInfosResponse> listAvailabilityZoneInfosInvoker(
        ListAvailabilityZoneInfosRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfos, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosNewRequest 请求对象
     * @return ListAvailabilityZoneInfosNewResponse
     */
    public ListAvailabilityZoneInfosNewResponse listAvailabilityZoneInfosNew(
        ListAvailabilityZoneInfosNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAvailabilityZoneInfosNew);
    }

    /**
     * 查询可用区信息
     *
     * 查询可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneInfosNewRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse>
     */
    public SyncInvoker<ListAvailabilityZoneInfosNewRequest, ListAvailabilityZoneInfosNewResponse> listAvailabilityZoneInfosNewInvoker(
        ListAvailabilityZoneInfosNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAvailabilityZoneInfosNew, hcClient);
    }

    /**
     * 列举数据库加密实例
     *
     * 列举数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbEncryptInstancesRequest 请求对象
     * @return ListDbEncryptInstancesResponse
     */
    public ListDbEncryptInstancesResponse listDbEncryptInstances(ListDbEncryptInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listDbEncryptInstances);
    }

    /**
     * 列举数据库加密实例
     *
     * 列举数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbEncryptInstancesRequest 请求对象
     * @return SyncInvoker<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse>
     */
    public SyncInvoker<ListDbEncryptInstancesRequest, ListDbEncryptInstancesResponse> listDbEncryptInstancesInvoker(
        ListDbEncryptInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listDbEncryptInstances, hcClient);
    }

    /**
     * 查询ECS服务器规格信息[待下线]
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return ListEcsSpecificationResponse
     */
    @Deprecated
    public ListEcsSpecificationResponse listEcsSpecification(ListEcsSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listEcsSpecification);
    }

    /**
     * 查询ECS服务器规格信息[待下线]
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationRequest 请求对象
     * @return SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse>
     */
    @Deprecated
    public SyncInvoker<ListEcsSpecificationRequest, ListEcsSpecificationResponse> listEcsSpecificationInvoker(
        ListEcsSpecificationRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listEcsSpecification, hcClient);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationNewRequest 请求对象
     * @return ListEcsSpecificationNewResponse
     */
    public ListEcsSpecificationNewResponse listEcsSpecificationNew(ListEcsSpecificationNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listEcsSpecificationNew);
    }

    /**
     * 查询ECS服务器规格信息
     *
     * 查询ECS服务器规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEcsSpecificationNewRequest 请求对象
     * @return SyncInvoker<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse>
     */
    public SyncInvoker<ListEcsSpecificationNewRequest, ListEcsSpecificationNewResponse> listEcsSpecificationNewInvoker(
        ListEcsSpecificationNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listEcsSpecificationNew, hcClient);
    }

    /**
     * 获取数据库运维集群实例
     *
     * 获取数据库运维集群实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listInstances);
    }

    /**
     * 获取数据库运维集群实例
     *
     * 获取数据库运维集群实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listInstances, hcClient);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return ListRdsDatabasesResponse
     */
    public ListRdsDatabasesResponse listRdsDatabases(ListRdsDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listRdsDatabases);
    }

    /**
     * 查询RDS数据库列表
     *
     * 查询RDS数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdsDatabasesRequest 请求对象
     * @return SyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse>
     */
    public SyncInvoker<ListRdsDatabasesRequest, ListRdsDatabasesResponse> listRdsDatabasesInvoker(
        ListRdsDatabasesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listRdsDatabases, hcClient);
    }

    /**
     * 查询SQL注入规则策略[待下线]
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return ListSqlInjectionRulesResponse
     */
    @Deprecated
    public ListSqlInjectionRulesResponse listSqlInjectionRules(ListSqlInjectionRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listSqlInjectionRules);
    }

    /**
     * 查询SQL注入规则策略[待下线]
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesRequest 请求对象
     * @return SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse>
     */
    @Deprecated
    public SyncInvoker<ListSqlInjectionRulesRequest, ListSqlInjectionRulesResponse> listSqlInjectionRulesInvoker(
        ListSqlInjectionRulesRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listSqlInjectionRules, hcClient);
    }

    /**
     * 重启审计实例[待下线]
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return RebootAuditInstanceResponse
     */
    @Deprecated
    public RebootAuditInstanceResponse rebootAuditInstance(RebootAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.rebootAuditInstance);
    }

    /**
     * 重启审计实例[待下线]
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceRequest 请求对象
     * @return SyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse>
     */
    @Deprecated
    public SyncInvoker<RebootAuditInstanceRequest, RebootAuditInstanceResponse> rebootAuditInstanceInvoker(
        RebootAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.rebootAuditInstance, hcClient);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceNewRequest 请求对象
     * @return RebootAuditInstanceNewResponse
     */
    public RebootAuditInstanceNewResponse rebootAuditInstanceNew(RebootAuditInstanceNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.rebootAuditInstanceNew);
    }

    /**
     * 重启审计实例
     *
     * 重启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootAuditInstanceNewRequest 请求对象
     * @return SyncInvoker<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse>
     */
    public SyncInvoker<RebootAuditInstanceNewRequest, RebootAuditInstanceNewResponse> rebootAuditInstanceNewInvoker(
        RebootAuditInstanceNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.rebootAuditInstanceNew, hcClient);
    }

    /**
     * 重启数据库加密实例
     *
     * 重启数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbEncryptInstanceRequest 请求对象
     * @return RebootDbEncryptInstanceResponse
     */
    public RebootDbEncryptInstanceResponse rebootDbEncryptInstance(RebootDbEncryptInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.rebootDbEncryptInstance);
    }

    /**
     * 重启数据库加密实例
     *
     * 重启数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbEncryptInstanceRequest 请求对象
     * @return SyncInvoker<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse>
     */
    public SyncInvoker<RebootDbEncryptInstanceRequest, RebootDbEncryptInstanceResponse> rebootDbEncryptInstanceInvoker(
        RebootDbEncryptInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.rebootDbEncryptInstance, hcClient);
    }

    /**
     * 重启数据库运维实例
     *
     * 重启数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbOmInstanceRequest 请求对象
     * @return RebootDbOmInstanceResponse
     */
    public RebootDbOmInstanceResponse rebootDbOmInstance(RebootDbOmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.rebootDbOmInstance);
    }

    /**
     * 重启数据库运维实例
     *
     * 重启数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootDbOmInstanceRequest 请求对象
     * @return SyncInvoker<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse>
     */
    public SyncInvoker<RebootDbOmInstanceRequest, RebootDbOmInstanceResponse> rebootDbOmInstanceInvoker(
        RebootDbOmInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.rebootDbOmInstance, hcClient);
    }

    /**
     * 重置数据库加密实例的密码
     *
     * 重置数据库加密实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbEncryptPasswordRequest 请求对象
     * @return ResetDbEncryptPasswordResponse
     */
    public ResetDbEncryptPasswordResponse resetDbEncryptPassword(ResetDbEncryptPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.resetDbEncryptPassword);
    }

    /**
     * 重置数据库加密实例的密码
     *
     * 重置数据库加密实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbEncryptPasswordRequest 请求对象
     * @return SyncInvoker<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse>
     */
    public SyncInvoker<ResetDbEncryptPasswordRequest, ResetDbEncryptPasswordResponse> resetDbEncryptPasswordInvoker(
        ResetDbEncryptPasswordRequest request) {
        return new SyncInvoker<>(request, DbssMeta.resetDbEncryptPassword, hcClient);
    }

    /**
     * 重置数据库运维实例的密码
     *
     * 重置数据库运维实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbOmPasswordRequest 请求对象
     * @return ResetDbOmPasswordResponse
     */
    public ResetDbOmPasswordResponse resetDbOmPassword(ResetDbOmPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.resetDbOmPassword);
    }

    /**
     * 重置数据库运维实例的密码
     *
     * 重置数据库运维实例的密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbOmPasswordRequest 请求对象
     * @return SyncInvoker<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse>
     */
    public SyncInvoker<ResetDbOmPasswordRequest, ResetDbOmPasswordResponse> resetDbOmPasswordInvoker(
        ResetDbOmPasswordRequest request) {
        return new SyncInvoker<>(request, DbssMeta.resetDbOmPassword, hcClient);
    }

    /**
     * 恢复备份信息
     *
     * 恢复备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAuditBackupRequest 请求对象
     * @return RestoreAuditBackupResponse
     */
    public RestoreAuditBackupResponse restoreAuditBackup(RestoreAuditBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.restoreAuditBackup);
    }

    /**
     * 恢复备份信息
     *
     * 恢复备份信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAuditBackupRequest 请求对象
     * @return SyncInvoker<RestoreAuditBackupRequest, RestoreAuditBackupResponse>
     */
    public SyncInvoker<RestoreAuditBackupRequest, RestoreAuditBackupResponse> restoreAuditBackupInvoker(
        RestoreAuditBackupRequest request) {
        return new SyncInvoker<>(request, DbssMeta.restoreAuditBackup, hcClient);
    }

    /**
     * 重试备份任务
     *
     * 重试备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryAuditBackupTaskRequest 请求对象
     * @return RetryAuditBackupTaskResponse
     */
    public RetryAuditBackupTaskResponse retryAuditBackupTask(RetryAuditBackupTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.retryAuditBackupTask);
    }

    /**
     * 重试备份任务
     *
     * 重试备份任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryAuditBackupTaskRequest 请求对象
     * @return SyncInvoker<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse>
     */
    public SyncInvoker<RetryAuditBackupTaskRequest, RetryAuditBackupTaskResponse> retryAuditBackupTaskInvoker(
        RetryAuditBackupTaskRequest request) {
        return new SyncInvoker<>(request, DbssMeta.retryAuditBackupTask, hcClient);
    }

    /**
     * 设置实例告警配置[待下线]
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return SetAlarmTopicConfigInfoResponse
     */
    @Deprecated
    public SetAlarmTopicConfigInfoResponse setAlarmTopicConfigInfo(SetAlarmTopicConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAlarmTopicConfigInfo);
    }

    /**
     * 设置实例告警配置[待下线]
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoRequest 请求对象
     * @return SyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse>
     */
    @Deprecated
    public SyncInvoker<SetAlarmTopicConfigInfoRequest, SetAlarmTopicConfigInfoResponse> setAlarmTopicConfigInfoInvoker(
        SetAlarmTopicConfigInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAlarmTopicConfigInfo, hcClient);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoNewRequest 请求对象
     * @return SetAlarmTopicConfigInfoNewResponse
     */
    public SetAlarmTopicConfigInfoNewResponse setAlarmTopicConfigInfoNew(SetAlarmTopicConfigInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAlarmTopicConfigInfoNew);
    }

    /**
     * 设置实例告警配置
     *
     * 设置实例告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAlarmTopicConfigInfoNewRequest 请求对象
     * @return SyncInvoker<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse>
     */
    public SyncInvoker<SetAlarmTopicConfigInfoNewRequest, SetAlarmTopicConfigInfoNewResponse> setAlarmTopicConfigInfoNewInvoker(
        SetAlarmTopicConfigInfoNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAlarmTopicConfigInfoNew, hcClient);
    }

    /**
     * 标记监控告警
     *
     * 标记监控告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAlarmLogStatusRequest 请求对象
     * @return SetAuditAlarmLogStatusResponse
     */
    public SetAuditAlarmLogStatusResponse setAuditAlarmLogStatus(SetAuditAlarmLogStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditAlarmLogStatus);
    }

    /**
     * 标记监控告警
     *
     * 标记监控告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAlarmLogStatusRequest 请求对象
     * @return SyncInvoker<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse>
     */
    public SyncInvoker<SetAuditAlarmLogStatusRequest, SetAuditAlarmLogStatusResponse> setAuditAlarmLogStatusInvoker(
        SetAuditAlarmLogStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditAlarmLogStatus, hcClient);
    }

    /**
     * 获取备份配置信息
     *
     * 设置备份配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAutoBackupTemplateRequest 请求对象
     * @return SetAuditAutoBackupTemplateResponse
     */
    public SetAuditAutoBackupTemplateResponse setAuditAutoBackupTemplate(SetAuditAutoBackupTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditAutoBackupTemplate);
    }

    /**
     * 获取备份配置信息
     *
     * 设置备份配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditAutoBackupTemplateRequest 请求对象
     * @return SyncInvoker<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse>
     */
    public SyncInvoker<SetAuditAutoBackupTemplateRequest, SetAuditAutoBackupTemplateResponse> setAuditAutoBackupTemplateInvoker(
        SetAuditAutoBackupTemplateRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditAutoBackupTemplate, hcClient);
    }

    /**
     * 风险导出开关(按DomainId)
     *
     * 风险导出开关(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupRiskSwitchRequest 请求对象
     * @return SetAuditBackupRiskSwitchResponse
     */
    public SetAuditBackupRiskSwitchResponse setAuditBackupRiskSwitch(SetAuditBackupRiskSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditBackupRiskSwitch);
    }

    /**
     * 风险导出开关(按DomainId)
     *
     * 风险导出开关(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupRiskSwitchRequest 请求对象
     * @return SyncInvoker<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse>
     */
    public SyncInvoker<SetAuditBackupRiskSwitchRequest, SetAuditBackupRiskSwitchResponse> setAuditBackupRiskSwitchInvoker(
        SetAuditBackupRiskSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditBackupRiskSwitch, hcClient);
    }

    /**
     * 开启/关闭备份
     *
     * 开启/关闭备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupSwitchRequest 请求对象
     * @return SetAuditBackupSwitchResponse
     */
    public SetAuditBackupSwitchResponse setAuditBackupSwitch(SetAuditBackupSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditBackupSwitch);
    }

    /**
     * 开启/关闭备份
     *
     * 开启/关闭备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditBackupSwitchRequest 请求对象
     * @return SyncInvoker<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse>
     */
    public SyncInvoker<SetAuditBackupSwitchRequest, SetAuditBackupSwitchResponse> setAuditBackupSwitchInvoker(
        SetAuditBackupSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditBackupSwitch, hcClient);
    }

    /**
     * 配置审计实例时区信息
     *
     * 配置审计实例时区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditInstanceTimeZoneRequest 请求对象
     * @return SetAuditInstanceTimeZoneResponse
     */
    public SetAuditInstanceTimeZoneResponse setAuditInstanceTimeZone(SetAuditInstanceTimeZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditInstanceTimeZone);
    }

    /**
     * 配置审计实例时区信息
     *
     * 配置审计实例时区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditInstanceTimeZoneRequest 请求对象
     * @return SyncInvoker<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse>
     */
    public SyncInvoker<SetAuditInstanceTimeZoneRequest, SetAuditInstanceTimeZoneResponse> setAuditInstanceTimeZoneInvoker(
        SetAuditInstanceTimeZoneRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditInstanceTimeZone, hcClient);
    }

    /**
     * 启用禁用策略
     *
     * 启用禁用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditScopeRuleSwitchRequest 请求对象
     * @return SetAuditScopeRuleSwitchResponse
     */
    public SetAuditScopeRuleSwitchResponse setAuditScopeRuleSwitch(SetAuditScopeRuleSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditScopeRuleSwitch);
    }

    /**
     * 启用禁用策略
     *
     * 启用禁用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditScopeRuleSwitchRequest 请求对象
     * @return SyncInvoker<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse>
     */
    public SyncInvoker<SetAuditScopeRuleSwitchRequest, SetAuditScopeRuleSwitchResponse> setAuditScopeRuleSwitchInvoker(
        SetAuditScopeRuleSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditScopeRuleSwitch, hcClient);
    }

    /**
     * 编辑风险操作策略
     *
     * 编辑风险操作策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskOperationPolicyRequest 请求对象
     * @return SetRiskOperationPolicyResponse
     */
    public SetRiskOperationPolicyResponse setRiskOperationPolicy(SetRiskOperationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setRiskOperationPolicy);
    }

    /**
     * 编辑风险操作策略
     *
     * 编辑风险操作策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskOperationPolicyRequest 请求对象
     * @return SyncInvoker<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse>
     */
    public SyncInvoker<SetRiskOperationPolicyRequest, SetRiskOperationPolicyResponse> setRiskOperationPolicyInvoker(
        SetRiskOperationPolicyRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setRiskOperationPolicy, hcClient);
    }

    /**
     * 审计实例风险规则排序
     *
     * 审计实例风险规则排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskRuleRankRequest 请求对象
     * @return SetRiskRuleRankResponse
     */
    public SetRiskRuleRankResponse setRiskRuleRank(SetRiskRuleRankRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setRiskRuleRank);
    }

    /**
     * 审计实例风险规则排序
     *
     * 审计实例风险规则排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRiskRuleRankRequest 请求对象
     * @return SyncInvoker<SetRiskRuleRankRequest, SetRiskRuleRankResponse>
     */
    public SyncInvoker<SetRiskRuleRankRequest, SetRiskRuleRankResponse> setRiskRuleRankInvoker(
        SetRiskRuleRankRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setRiskRuleRank, hcClient);
    }

    /**
     * 启用禁用单条隐私数据脱敏规则
     *
     * 启用禁用隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveMaskRuleSwitchRequest 请求对象
     * @return SetSensitiveMaskRuleSwitchResponse
     */
    public SetSensitiveMaskRuleSwitchResponse setSensitiveMaskRuleSwitch(SetSensitiveMaskRuleSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setSensitiveMaskRuleSwitch);
    }

    /**
     * 启用禁用单条隐私数据脱敏规则
     *
     * 启用禁用隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveMaskRuleSwitchRequest 请求对象
     * @return SyncInvoker<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse>
     */
    public SyncInvoker<SetSensitiveMaskRuleSwitchRequest, SetSensitiveMaskRuleSwitchResponse> setSensitiveMaskRuleSwitchInvoker(
        SetSensitiveMaskRuleSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setSensitiveMaskRuleSwitch, hcClient);
    }

    /**
     * 开启关闭结果集存储
     *
     * 开启关闭结果集存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveResultSwitchRequest 请求对象
     * @return SetSensitiveResultSwitchResponse
     */
    public SetSensitiveResultSwitchResponse setSensitiveResultSwitch(SetSensitiveResultSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setSensitiveResultSwitch);
    }

    /**
     * 开启关闭结果集存储
     *
     * 开启关闭结果集存储
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveResultSwitchRequest 请求对象
     * @return SyncInvoker<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse>
     */
    public SyncInvoker<SetSensitiveResultSwitchRequest, SetSensitiveResultSwitchResponse> setSensitiveResultSwitchInvoker(
        SetSensitiveResultSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setSensitiveResultSwitch, hcClient);
    }

    /**
     * 开启关闭隐私数据脱敏功能
     *
     * 开启关闭隐私数据脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSwitchRequest 请求对象
     * @return SetSensitiveSwitchResponse
     */
    public SetSensitiveSwitchResponse setSensitiveSwitch(SetSensitiveSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setSensitiveSwitch);
    }

    /**
     * 开启关闭隐私数据脱敏功能
     *
     * 开启关闭隐私数据脱敏
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSwitchRequest 请求对象
     * @return SyncInvoker<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse>
     */
    public SyncInvoker<SetSensitiveSwitchRequest, SetSensitiveSwitchResponse> setSensitiveSwitchInvoker(
        SetSensitiveSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setSensitiveSwitch, hcClient);
    }

    /**
     * 获取单个风险导出配置
     *
     * 获取单个风险导出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackRiskTemplateRequest 请求对象
     * @return ShowAuditBackRiskTemplateResponse
     */
    public ShowAuditBackRiskTemplateResponse showAuditBackRiskTemplate(ShowAuditBackRiskTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditBackRiskTemplate);
    }

    /**
     * 获取单个风险导出配置
     *
     * 获取单个风险导出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackRiskTemplateRequest 请求对象
     * @return SyncInvoker<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse>
     */
    public SyncInvoker<ShowAuditBackRiskTemplateRequest, ShowAuditBackRiskTemplateResponse> showAuditBackRiskTemplateInvoker(
        ShowAuditBackRiskTemplateRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditBackRiskTemplate, hcClient);
    }

    /**
     * 获取备份状态
     *
     * 获取备份状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackupStatusRequest 请求对象
     * @return ShowAuditBackupStatusResponse
     */
    public ShowAuditBackupStatusResponse showAuditBackupStatus(ShowAuditBackupStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditBackupStatus);
    }

    /**
     * 获取备份状态
     *
     * 获取备份状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditBackupStatusRequest 请求对象
     * @return SyncInvoker<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse>
     */
    public SyncInvoker<ShowAuditBackupStatusRequest, ShowAuditBackupStatusResponse> showAuditBackupStatusInvoker(
        ShowAuditBackupStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditBackupStatus, hcClient);
    }

    /**
     * 查询账户配额信息[待下线]
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return ShowAuditQuotaResponse
     */
    @Deprecated
    public ShowAuditQuotaResponse showAuditQuota(ShowAuditQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditQuota);
    }

    /**
     * 查询账户配额信息[待下线]
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaRequest 请求对象
     * @return SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse>
     */
    @Deprecated
    public SyncInvoker<ShowAuditQuotaRequest, ShowAuditQuotaResponse> showAuditQuotaInvoker(
        ShowAuditQuotaRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditQuota, hcClient);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaNewRequest 请求对象
     * @return ShowAuditQuotaNewResponse
     */
    public ShowAuditQuotaNewResponse showAuditQuotaNew(ShowAuditQuotaNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditQuotaNew);
    }

    /**
     * 查询账户配额信息
     *
     * 查询账户配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditQuotaNewRequest 请求对象
     * @return SyncInvoker<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse>
     */
    public SyncInvoker<ShowAuditQuotaNewRequest, ShowAuditQuotaNewResponse> showAuditQuotaNewInvoker(
        ShowAuditQuotaNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditQuotaNew, hcClient);
    }

    /**
     * 查询指定风险规则策略[待下线]
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return ShowAuditRuleRiskResponse
     */
    @Deprecated
    public ShowAuditRuleRiskResponse showAuditRuleRisk(ShowAuditRuleRiskRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditRuleRisk);
    }

    /**
     * 查询指定风险规则策略[待下线]
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskRequest 请求对象
     * @return SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse>
     */
    @Deprecated
    public SyncInvoker<ShowAuditRuleRiskRequest, ShowAuditRuleRiskResponse> showAuditRuleRiskInvoker(
        ShowAuditRuleRiskRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditRuleRisk, hcClient);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskNewRequest 请求对象
     * @return ShowAuditRuleRiskNewResponse
     */
    public ShowAuditRuleRiskNewResponse showAuditRuleRiskNew(ShowAuditRuleRiskNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditRuleRiskNew);
    }

    /**
     * 查询指定风险规则策略
     *
     * 查询指定风险规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditRuleRiskNewRequest 请求对象
     * @return SyncInvoker<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse>
     */
    public SyncInvoker<ShowAuditRuleRiskNewRequest, ShowAuditRuleRiskNewResponse> showAuditRuleRiskNewInvoker(
        ShowAuditRuleRiskNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditRuleRiskNew, hcClient);
    }

    /**
     * 获取租户下所有实例的风险汇总信息
     *
     * 获取租户下所有实例的风险汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditStatisticsRequest 请求对象
     * @return ShowAuditStatisticsResponse
     */
    public ShowAuditStatisticsResponse showAuditStatistics(ShowAuditStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditStatistics);
    }

    /**
     * 获取租户下所有实例的风险汇总信息
     *
     * 获取租户下所有实例的风险汇总信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditStatisticsRequest 请求对象
     * @return SyncInvoker<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse>
     */
    public SyncInvoker<ShowAuditStatisticsRequest, ShowAuditStatisticsResponse> showAuditStatisticsInvoker(
        ShowAuditStatisticsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditStatistics, hcClient);
    }

    /**
     * 获取租户审计信息汇总任务状态
     *
     * 获取租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTaskStatusRequest 请求对象
     * @return ShowAuditTaskStatusResponse
     */
    public ShowAuditTaskStatusResponse showAuditTaskStatus(ShowAuditTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditTaskStatus);
    }

    /**
     * 获取租户审计信息汇总任务状态
     *
     * 获取租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTaskStatusRequest 请求对象
     * @return SyncInvoker<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse>
     */
    public SyncInvoker<ShowAuditTaskStatusRequest, ShowAuditTaskStatusResponse> showAuditTaskStatusInvoker(
        ShowAuditTaskStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditTaskStatus, hcClient);
    }

    /**
     * 获取报表的计划任务配置信息（topic方式）
     *
     * 获取报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTopicReportSchedulerConfigRequest 请求对象
     * @return ShowAuditTopicReportSchedulerConfigResponse
     */
    public ShowAuditTopicReportSchedulerConfigResponse showAuditTopicReportSchedulerConfig(
        ShowAuditTopicReportSchedulerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditTopicReportSchedulerConfig);
    }

    /**
     * 获取报表的计划任务配置信息（topic方式）
     *
     * 获取报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditTopicReportSchedulerConfigRequest 请求对象
     * @return SyncInvoker<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse>
     */
    public SyncInvoker<ShowAuditTopicReportSchedulerConfigRequest, ShowAuditTopicReportSchedulerConfigResponse> showAuditTopicReportSchedulerConfigInvoker(
        ShowAuditTopicReportSchedulerConfigRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditTopicReportSchedulerConfig, hcClient);
    }

    /**
     * 查询租户的实例是否可升级
     *
     * 查询租户的实例是否可升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditUpgradeStatusRequest 请求对象
     * @return ShowAuditUpgradeStatusResponse
     */
    public ShowAuditUpgradeStatusResponse showAuditUpgradeStatus(ShowAuditUpgradeStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showAuditUpgradeStatus);
    }

    /**
     * 查询租户的实例是否可升级
     *
     * 查询租户的实例是否可升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditUpgradeStatusRequest 请求对象
     * @return SyncInvoker<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse>
     */
    public SyncInvoker<ShowAuditUpgradeStatusRequest, ShowAuditUpgradeStatusResponse> showAuditUpgradeStatusInvoker(
        ShowAuditUpgradeStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showAuditUpgradeStatus, hcClient);
    }

    /**
     * 获取风险导出桶名和路径
     *
     * 获取风险导出桶名和路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRiskBucketPathRequest 请求对象
     * @return ShowBackupRiskBucketPathResponse
     */
    public ShowBackupRiskBucketPathResponse showBackupRiskBucketPath(ShowBackupRiskBucketPathRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showBackupRiskBucketPath);
    }

    /**
     * 获取风险导出桶名和路径
     *
     * 获取风险导出桶名和路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRiskBucketPathRequest 请求对象
     * @return SyncInvoker<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse>
     */
    public SyncInvoker<ShowBackupRiskBucketPathRequest, ShowBackupRiskBucketPathResponse> showBackupRiskBucketPathInvoker(
        ShowBackupRiskBucketPathRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showBackupRiskBucketPath, hcClient);
    }

    /**
     * 获取实例监控数据
     *
     * 获取实例监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorInfoRequest 请求对象
     * @return ShowInstanceMonitorInfoResponse
     */
    public ShowInstanceMonitorInfoResponse showInstanceMonitorInfo(ShowInstanceMonitorInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showInstanceMonitorInfo);
    }

    /**
     * 获取实例监控数据
     *
     * 获取实例监控数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse>
     */
    public SyncInvoker<ShowInstanceMonitorInfoRequest, ShowInstanceMonitorInfoResponse> showInstanceMonitorInfoInvoker(
        ShowInstanceMonitorInfoRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showInstanceMonitorInfo, hcClient);
    }

    /**
     * 查询加密/运维增强配额
     *
     * 查询加密/运维增强配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceQuotaRequest 请求对象
     * @return ShowInstanceQuotaResponse
     */
    public ShowInstanceQuotaResponse showInstanceQuota(ShowInstanceQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showInstanceQuota);
    }

    /**
     * 查询加密/运维增强配额
     *
     * 查询加密/运维增强配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceQuotaRequest 请求对象
     * @return SyncInvoker<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse>
     */
    public SyncInvoker<ShowInstanceQuotaRequest, ShowInstanceQuotaResponse> showInstanceQuotaInvoker(
        ShowInstanceQuotaRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showInstanceQuota, hcClient);
    }

    /**
     * 获取隐私数据脱敏开关
     *
     * 获取隐私数据脱敏开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveMaskSwitchRequest 请求对象
     * @return ShowSensitiveMaskSwitchResponse
     */
    public ShowSensitiveMaskSwitchResponse showSensitiveMaskSwitch(ShowSensitiveMaskSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showSensitiveMaskSwitch);
    }

    /**
     * 获取隐私数据脱敏开关
     *
     * 获取隐私数据脱敏开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveMaskSwitchRequest 请求对象
     * @return SyncInvoker<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse>
     */
    public SyncInvoker<ShowSensitiveMaskSwitchRequest, ShowSensitiveMaskSwitchResponse> showSensitiveMaskSwitchInvoker(
        ShowSensitiveMaskSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showSensitiveMaskSwitch, hcClient);
    }

    /**
     * 获取隐私数据结果集开关
     *
     * 获取隐私数据结果集开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveResultSwitchRequest 请求对象
     * @return ShowSensitiveResultSwitchResponse
     */
    public ShowSensitiveResultSwitchResponse showSensitiveResultSwitch(ShowSensitiveResultSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showSensitiveResultSwitch);
    }

    /**
     * 获取隐私数据结果集开关
     *
     * 获取隐私数据结果集开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSensitiveResultSwitchRequest 请求对象
     * @return SyncInvoker<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse>
     */
    public SyncInvoker<ShowSensitiveResultSwitchRequest, ShowSensitiveResultSwitchResponse> showSensitiveResultSwitchInvoker(
        ShowSensitiveResultSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showSensitiveResultSwitch, hcClient);
    }

    /**
     * 获取管理侧版本信息
     *
     * 获取管理侧版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVersionRequest 请求对象
     * @return ShowServerVersionResponse
     */
    public ShowServerVersionResponse showServerVersion(ShowServerVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showServerVersion);
    }

    /**
     * 获取管理侧版本信息
     *
     * 获取管理侧版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVersionRequest 请求对象
     * @return SyncInvoker<ShowServerVersionRequest, ShowServerVersionResponse>
     */
    public SyncInvoker<ShowServerVersionRequest, ShowServerVersionResponse> showServerVersionInvoker(
        ShowServerVersionRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showServerVersion, hcClient);
    }

    /**
     * 获取指定SQL语句的详细信息
     *
     * 获取指定SQL语句的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlDetailRequest 请求对象
     * @return ShowSqlDetailResponse
     */
    public ShowSqlDetailResponse showSqlDetail(ShowSqlDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.showSqlDetail);
    }

    /**
     * 获取指定SQL语句的详细信息
     *
     * 获取指定SQL语句的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlDetailRequest 请求对象
     * @return SyncInvoker<ShowSqlDetailRequest, ShowSqlDetailResponse>
     */
    public SyncInvoker<ShowSqlDetailRequest, ShowSqlDetailResponse> showSqlDetailInvoker(ShowSqlDetailRequest request) {
        return new SyncInvoker<>(request, DbssMeta.showSqlDetail, hcClient);
    }

    /**
     * 开启审计实例[待下线]
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return StartAuditInstanceResponse
     */
    @Deprecated
    public StartAuditInstanceResponse startAuditInstance(StartAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.startAuditInstance);
    }

    /**
     * 开启审计实例[待下线]
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceRequest 请求对象
     * @return SyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse>
     */
    @Deprecated
    public SyncInvoker<StartAuditInstanceRequest, StartAuditInstanceResponse> startAuditInstanceInvoker(
        StartAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.startAuditInstance, hcClient);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceNewRequest 请求对象
     * @return StartAuditInstanceNewResponse
     */
    public StartAuditInstanceNewResponse startAuditInstanceNew(StartAuditInstanceNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.startAuditInstanceNew);
    }

    /**
     * 开启审计实例
     *
     * 开启审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAuditInstanceNewRequest 请求对象
     * @return SyncInvoker<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse>
     */
    public SyncInvoker<StartAuditInstanceNewRequest, StartAuditInstanceNewResponse> startAuditInstanceNewInvoker(
        StartAuditInstanceNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.startAuditInstanceNew, hcClient);
    }

    /**
     * 启动数据库加密实例
     *
     * 启动数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbEncryptInstanceRequest 请求对象
     * @return StartDbEncryptInstanceResponse
     */
    public StartDbEncryptInstanceResponse startDbEncryptInstance(StartDbEncryptInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.startDbEncryptInstance);
    }

    /**
     * 启动数据库加密实例
     *
     * 启动数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbEncryptInstanceRequest 请求对象
     * @return SyncInvoker<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse>
     */
    public SyncInvoker<StartDbEncryptInstanceRequest, StartDbEncryptInstanceResponse> startDbEncryptInstanceInvoker(
        StartDbEncryptInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.startDbEncryptInstance, hcClient);
    }

    /**
     * 启动数据库运维实例
     *
     * 启动数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbOmInstanceRequest 请求对象
     * @return StartDbOmInstanceResponse
     */
    public StartDbOmInstanceResponse startDbOmInstance(StartDbOmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.startDbOmInstance);
    }

    /**
     * 启动数据库运维实例
     *
     * 启动数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDbOmInstanceRequest 请求对象
     * @return SyncInvoker<StartDbOmInstanceRequest, StartDbOmInstanceResponse>
     */
    public SyncInvoker<StartDbOmInstanceRequest, StartDbOmInstanceResponse> startDbOmInstanceInvoker(
        StartDbOmInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.startDbOmInstance, hcClient);
    }

    /**
     * 关闭审计实例[待下线]
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return StopAuditInstanceResponse
     */
    @Deprecated
    public StopAuditInstanceResponse stopAuditInstance(StopAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.stopAuditInstance);
    }

    /**
     * 关闭审计实例[待下线]
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceRequest 请求对象
     * @return SyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse>
     */
    @Deprecated
    public SyncInvoker<StopAuditInstanceRequest, StopAuditInstanceResponse> stopAuditInstanceInvoker(
        StopAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.stopAuditInstance, hcClient);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceNewRequest 请求对象
     * @return StopAuditInstanceNewResponse
     */
    public StopAuditInstanceNewResponse stopAuditInstanceNew(StopAuditInstanceNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.stopAuditInstanceNew);
    }

    /**
     * 关闭审计实例
     *
     * 关闭审计实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAuditInstanceNewRequest 请求对象
     * @return SyncInvoker<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse>
     */
    public SyncInvoker<StopAuditInstanceNewRequest, StopAuditInstanceNewResponse> stopAuditInstanceNewInvoker(
        StopAuditInstanceNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.stopAuditInstanceNew, hcClient);
    }

    /**
     * 停止数据库加密实例
     *
     * 停止数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbEncryptInstanceRequest 请求对象
     * @return StopDbEncryptInstanceResponse
     */
    public StopDbEncryptInstanceResponse stopDbEncryptInstance(StopDbEncryptInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.stopDbEncryptInstance);
    }

    /**
     * 停止数据库加密实例
     *
     * 停止数据库加密实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbEncryptInstanceRequest 请求对象
     * @return SyncInvoker<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse>
     */
    public SyncInvoker<StopDbEncryptInstanceRequest, StopDbEncryptInstanceResponse> stopDbEncryptInstanceInvoker(
        StopDbEncryptInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.stopDbEncryptInstance, hcClient);
    }

    /**
     * 停止数据库运维实例
     *
     * 停止数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbOmInstanceRequest 请求对象
     * @return StopDbOmInstanceResponse
     */
    public StopDbOmInstanceResponse stopDbOmInstance(StopDbOmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.stopDbOmInstance);
    }

    /**
     * 停止数据库运维实例
     *
     * 停止数据库运维实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDbOmInstanceRequest 请求对象
     * @return SyncInvoker<StopDbOmInstanceRequest, StopDbOmInstanceResponse>
     */
    public SyncInvoker<StopDbOmInstanceRequest, StopDbOmInstanceResponse> stopDbOmInstanceInvoker(
        StopDbOmInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.stopDbOmInstance, hcClient);
    }

    /**
     * 开启关闭Agent[待下线]
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return SwitchAgentResponse
     */
    @Deprecated
    public SwitchAgentResponse switchAgent(SwitchAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAgent);
    }

    /**
     * 开启关闭Agent[待下线]
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentRequest 请求对象
     * @return SyncInvoker<SwitchAgentRequest, SwitchAgentResponse>
     */
    @Deprecated
    public SyncInvoker<SwitchAgentRequest, SwitchAgentResponse> switchAgentInvoker(SwitchAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAgent, hcClient);
    }

    /**
     * 开启关闭数据库[待下线]
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return SwitchAuditDatabaseResponse
     */
    @Deprecated
    public SwitchAuditDatabaseResponse switchAuditDatabase(SwitchAuditDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAuditDatabase);
    }

    /**
     * 开启关闭数据库[待下线]
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseRequest 请求对象
     * @return SyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse>
     */
    @Deprecated
    public SyncInvoker<SwitchAuditDatabaseRequest, SwitchAuditDatabaseResponse> switchAuditDatabaseInvoker(
        SwitchAuditDatabaseRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAuditDatabase, hcClient);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseNewRequest 请求对象
     * @return SwitchAuditDatabaseNewResponse
     */
    public SwitchAuditDatabaseNewResponse switchAuditDatabaseNew(SwitchAuditDatabaseNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAuditDatabaseNew);
    }

    /**
     * 开启关闭数据库
     *
     * 开启关闭数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAuditDatabaseNewRequest 请求对象
     * @return SyncInvoker<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse>
     */
    public SyncInvoker<SwitchAuditDatabaseNewRequest, SwitchAuditDatabaseNewResponse> switchAuditDatabaseNewInvoker(
        SwitchAuditDatabaseNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAuditDatabaseNew, hcClient);
    }

    /**
     * 开启关闭风险规则[待下线]
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return SwitchRiskRuleResponse
     */
    @Deprecated
    public SwitchRiskRuleResponse switchRiskRule(SwitchRiskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchRiskRule);
    }

    /**
     * 开启关闭风险规则[待下线]
     *
     * 开启关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleRequest 请求对象
     * @return SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse>
     */
    @Deprecated
    public SyncInvoker<SwitchRiskRuleRequest, SwitchRiskRuleResponse> switchRiskRuleInvoker(
        SwitchRiskRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchRiskRule, hcClient);
    }

    /**
     * 开启/关闭风险规则
     *
     * 开启/关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleNewRequest 请求对象
     * @return SwitchRiskRuleNewResponse
     */
    public SwitchRiskRuleNewResponse switchRiskRuleNew(SwitchRiskRuleNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchRiskRuleNew);
    }

    /**
     * 开启/关闭风险规则
     *
     * 开启/关闭风险规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRiskRuleNewRequest 请求对象
     * @return SyncInvoker<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse>
     */
    public SyncInvoker<SwitchRiskRuleNewRequest, SwitchRiskRuleNewResponse> switchRiskRuleNewInvoker(
        SwitchRiskRuleNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchRiskRuleNew, hcClient);
    }

    /**
     * 解绑数据库加密实例的eip
     *
     * 解绑数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbEncryptEipRequest 请求对象
     * @return UnbindDbEncryptEipResponse
     */
    public UnbindDbEncryptEipResponse unbindDbEncryptEip(UnbindDbEncryptEipRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.unbindDbEncryptEip);
    }

    /**
     * 解绑数据库加密实例的eip
     *
     * 解绑数据库加密实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbEncryptEipRequest 请求对象
     * @return SyncInvoker<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse>
     */
    public SyncInvoker<UnbindDbEncryptEipRequest, UnbindDbEncryptEipResponse> unbindDbEncryptEipInvoker(
        UnbindDbEncryptEipRequest request) {
        return new SyncInvoker<>(request, DbssMeta.unbindDbEncryptEip, hcClient);
    }

    /**
     * 解绑数据库运维实例的eip
     *
     * 解绑数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbOmEipRequest 请求对象
     * @return UnbindDbOmEipResponse
     */
    public UnbindDbOmEipResponse unbindDbOmEip(UnbindDbOmEipRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.unbindDbOmEip);
    }

    /**
     * 解绑数据库运维实例的eip
     *
     * 解绑数据库运维实例的eip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDbOmEipRequest 请求对象
     * @return SyncInvoker<UnbindDbOmEipRequest, UnbindDbOmEipResponse>
     */
    public SyncInvoker<UnbindDbOmEipRequest, UnbindDbOmEipResponse> unbindDbOmEipInvoker(UnbindDbOmEipRequest request) {
        return new SyncInvoker<>(request, DbssMeta.unbindDbOmEip, hcClient);
    }

    /**
     * 更新审计实例信息[待下线]
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return UpdateAuditInstanceResponse
     */
    @Deprecated
    public UpdateAuditInstanceResponse updateAuditInstance(UpdateAuditInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditInstance);
    }

    /**
     * 更新审计实例信息[待下线]
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse>
     */
    @Deprecated
    public SyncInvoker<UpdateAuditInstanceRequest, UpdateAuditInstanceResponse> updateAuditInstanceInvoker(
        UpdateAuditInstanceRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditInstance, hcClient);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceNewRequest 请求对象
     * @return UpdateAuditInstanceNewResponse
     */
    public UpdateAuditInstanceNewResponse updateAuditInstanceNew(UpdateAuditInstanceNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditInstanceNew);
    }

    /**
     * 更新审计实例信息
     *
     * 更新审计实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditInstanceNewRequest 请求对象
     * @return SyncInvoker<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse>
     */
    public SyncInvoker<UpdateAuditInstanceNewRequest, UpdateAuditInstanceNewResponse> updateAuditInstanceNewInvoker(
        UpdateAuditInstanceNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditInstanceNew, hcClient);
    }

    /**
     * 修改风险导出桶名和路径(按DomainId)
     *
     * 修改风险导出桶名和路径(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditRiskBucketPathRequest 请求对象
     * @return UpdateAuditRiskBucketPathResponse
     */
    public UpdateAuditRiskBucketPathResponse updateAuditRiskBucketPath(UpdateAuditRiskBucketPathRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditRiskBucketPath);
    }

    /**
     * 修改风险导出桶名和路径(按DomainId)
     *
     * 修改风险导出桶名和路径(按DomainId)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditRiskBucketPathRequest 请求对象
     * @return SyncInvoker<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse>
     */
    public SyncInvoker<UpdateAuditRiskBucketPathRequest, UpdateAuditRiskBucketPathResponse> updateAuditRiskBucketPathInvoker(
        UpdateAuditRiskBucketPathRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditRiskBucketPath, hcClient);
    }

    /**
     * 编辑审计范围规则
     *
     * 编辑审计范围规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditScopeRuleRequest 请求对象
     * @return UpdateAuditScopeRuleResponse
     */
    public UpdateAuditScopeRuleResponse updateAuditScopeRule(UpdateAuditScopeRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditScopeRule);
    }

    /**
     * 编辑审计范围规则
     *
     * 编辑审计范围规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditScopeRuleRequest 请求对象
     * @return SyncInvoker<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse>
     */
    public SyncInvoker<UpdateAuditScopeRuleRequest, UpdateAuditScopeRuleResponse> updateAuditScopeRuleInvoker(
        UpdateAuditScopeRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditScopeRule, hcClient);
    }

    /**
     * 修改实例安全组[待下线]
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return UpdateAuditSecurityGroupResponse
     */
    @Deprecated
    public UpdateAuditSecurityGroupResponse updateAuditSecurityGroup(UpdateAuditSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditSecurityGroup);
    }

    /**
     * 修改实例安全组[待下线]
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse>
     */
    @Deprecated
    public SyncInvoker<UpdateAuditSecurityGroupRequest, UpdateAuditSecurityGroupResponse> updateAuditSecurityGroupInvoker(
        UpdateAuditSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditSecurityGroup, hcClient);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupNewRequest 请求对象
     * @return UpdateAuditSecurityGroupNewResponse
     */
    public UpdateAuditSecurityGroupNewResponse updateAuditSecurityGroupNew(UpdateAuditSecurityGroupNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditSecurityGroupNew);
    }

    /**
     * 修改实例安全组
     *
     * 修改实例安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSecurityGroupNewRequest 请求对象
     * @return SyncInvoker<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse>
     */
    public SyncInvoker<UpdateAuditSecurityGroupNewRequest, UpdateAuditSecurityGroupNewResponse> updateAuditSecurityGroupNewInvoker(
        UpdateAuditSecurityGroupNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditSecurityGroupNew, hcClient);
    }

    /**
     * 更新租户审计信息汇总任务状态
     *
     * 更新租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTaskStatusRequest 请求对象
     * @return UpdateAuditTaskStatusResponse
     */
    public UpdateAuditTaskStatusResponse updateAuditTaskStatus(UpdateAuditTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditTaskStatus);
    }

    /**
     * 更新租户审计信息汇总任务状态
     *
     * 更新租户审计信息汇总任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTaskStatusRequest 请求对象
     * @return SyncInvoker<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse>
     */
    public SyncInvoker<UpdateAuditTaskStatusRequest, UpdateAuditTaskStatusResponse> updateAuditTaskStatusInvoker(
        UpdateAuditTaskStatusRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditTaskStatus, hcClient);
    }

    /**
     * 更改报表的计划任务配置信息（topic方式）
     *
     * 更改报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTopicReportSchedulerConfigRequest 请求对象
     * @return UpdateAuditTopicReportSchedulerConfigResponse
     */
    public UpdateAuditTopicReportSchedulerConfigResponse updateAuditTopicReportSchedulerConfig(
        UpdateAuditTopicReportSchedulerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditTopicReportSchedulerConfig);
    }

    /**
     * 更改报表的计划任务配置信息（topic方式）
     *
     * 更改报表的计划任务配置信息（topic方式）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditTopicReportSchedulerConfigRequest 请求对象
     * @return SyncInvoker<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse>
     */
    public SyncInvoker<UpdateAuditTopicReportSchedulerConfigRequest, UpdateAuditTopicReportSchedulerConfigResponse> updateAuditTopicReportSchedulerConfigInvoker(
        UpdateAuditTopicReportSchedulerConfigRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditTopicReportSchedulerConfig, hcClient);
    }

    /**
     * 更改数据库加密实例的名称
     *
     * 更改数据库加密实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbEncryptInstanceNameRequest 请求对象
     * @return UpdateDbEncryptInstanceNameResponse
     */
    public UpdateDbEncryptInstanceNameResponse updateDbEncryptInstanceName(UpdateDbEncryptInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateDbEncryptInstanceName);
    }

    /**
     * 更改数据库加密实例的名称
     *
     * 更改数据库加密实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbEncryptInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse>
     */
    public SyncInvoker<UpdateDbEncryptInstanceNameRequest, UpdateDbEncryptInstanceNameResponse> updateDbEncryptInstanceNameInvoker(
        UpdateDbEncryptInstanceNameRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateDbEncryptInstanceName, hcClient);
    }

    /**
     * 更改数据库运维实例的名称
     *
     * 更改数据库运维实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbOmInstanceNameRequest 请求对象
     * @return UpdateDbOmInstanceNameResponse
     */
    public UpdateDbOmInstanceNameResponse updateDbOmInstanceName(UpdateDbOmInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateDbOmInstanceName);
    }

    /**
     * 更改数据库运维实例的名称
     *
     * 更改数据库运维实例的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbOmInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse>
     */
    public SyncInvoker<UpdateDbOmInstanceNameRequest, UpdateDbOmInstanceNameResponse> updateDbOmInstanceNameInvoker(
        UpdateDbOmInstanceNameRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateDbOmInstanceName, hcClient);
    }

    /**
     * 修改编辑隐私数据脱敏规则
     *
     * 修改编辑隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSensitiveMaskRuleRequest 请求对象
     * @return UpdateSensitiveMaskRuleResponse
     */
    public UpdateSensitiveMaskRuleResponse updateSensitiveMaskRule(UpdateSensitiveMaskRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateSensitiveMaskRule);
    }

    /**
     * 修改编辑隐私数据脱敏规则
     *
     * 修改编辑隐私数据脱敏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSensitiveMaskRuleRequest 请求对象
     * @return SyncInvoker<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse>
     */
    public SyncInvoker<UpdateSensitiveMaskRuleRequest, UpdateSensitiveMaskRuleResponse> updateSensitiveMaskRuleInvoker(
        UpdateSensitiveMaskRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateSensitiveMaskRule, hcClient);
    }

    /**
     * 往OBS导出审计数据库配置
     *
     * 往OBS导出审计数据库配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAuditDbConfigRequest 请求对象
     * @return UploadAuditDbConfigResponse
     */
    public UploadAuditDbConfigResponse uploadAuditDbConfig(UploadAuditDbConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.uploadAuditDbConfig);
    }

    /**
     * 往OBS导出审计数据库配置
     *
     * 往OBS导出审计数据库配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAuditDbConfigRequest 请求对象
     * @return SyncInvoker<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse>
     */
    public SyncInvoker<UploadAuditDbConfigRequest, UploadAuditDbConfigResponse> uploadAuditDbConfigInvoker(
        UploadAuditDbConfigRequest request) {
        return new SyncInvoker<>(request, DbssMeta.uploadAuditDbConfig, hcClient);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentNewRequest 请求对象
     * @return AddAuditAgentNewResponse
     */
    public AddAuditAgentNewResponse addAuditAgentNew(AddAuditAgentNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.addAuditAgentNew);
    }

    /**
     * 添加审计数据库Agent
     *
     * 添加审计数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAuditAgentNewRequest 请求对象
     * @return SyncInvoker<AddAuditAgentNewRequest, AddAuditAgentNewResponse>
     */
    public SyncInvoker<AddAuditAgentNewRequest, AddAuditAgentNewResponse> addAuditAgentNewInvoker(
        AddAuditAgentNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.addAuditAgentNew, hcClient);
    }

    /**
     * 指定agent_id方式添加agent
     *
     * 指定agent_id方式添加agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditDbAgentRequest 请求对象
     * @return CreateAuditDbAgentResponse
     */
    public CreateAuditDbAgentResponse createAuditDbAgent(CreateAuditDbAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createAuditDbAgent);
    }

    /**
     * 指定agent_id方式添加agent
     *
     * 指定agent_id方式添加agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditDbAgentRequest 请求对象
     * @return SyncInvoker<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse>
     */
    public SyncInvoker<CreateAuditDbAgentRequest, CreateAuditDbAgentResponse> createAuditDbAgentInvoker(
        CreateAuditDbAgentRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createAuditDbAgent, hcClient);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentNewRequest 请求对象
     * @return DeleteAuditAgentNewResponse
     */
    public DeleteAuditAgentNewResponse deleteAuditAgentNew(DeleteAuditAgentNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditAgentNew);
    }

    /**
     * 删除数据库Agent
     *
     * 删除数据库Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditAgentNewRequest 请求对象
     * @return SyncInvoker<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse>
     */
    public SyncInvoker<DeleteAuditAgentNewRequest, DeleteAuditAgentNewResponse> deleteAuditAgentNewInvoker(
        DeleteAuditAgentNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditAgentNew, hcClient);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentNewRequest 请求对象
     * @return DownloadAuditAgentNewResponse
     */
    public DownloadAuditAgentNewResponse downloadAuditAgentNew(DownloadAuditAgentNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.downloadAuditAgentNew);
    }

    /**
     * 下载审计Agent
     *
     * 下载审计Agent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAuditAgentNewRequest 请求对象
     * @return SyncInvoker<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse>
     */
    public SyncInvoker<DownloadAuditAgentNewRequest, DownloadAuditAgentNewResponse> downloadAuditAgentNewInvoker(
        DownloadAuditAgentNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.downloadAuditAgentNew, hcClient);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentNewRequest 请求对象
     * @return ListAuditAgentNewResponse
     */
    public ListAuditAgentNewResponse listAuditAgentNew(ListAuditAgentNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditAgentNew);
    }

    /**
     * 查询数据库Agent列表
     *
     * 查询数据库Agent列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditAgentNewRequest 请求对象
     * @return SyncInvoker<ListAuditAgentNewRequest, ListAuditAgentNewResponse>
     */
    public SyncInvoker<ListAuditAgentNewRequest, ListAuditAgentNewResponse> listAuditAgentNewInvoker(
        ListAuditAgentNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditAgentNew, hcClient);
    }

    /**
     * 开启/关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentNewRequest 请求对象
     * @return SwitchAgentNewResponse
     */
    public SwitchAgentNewResponse switchAgentNew(SwitchAgentNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.switchAgentNew);
    }

    /**
     * 开启/关闭Agent
     *
     * 用于开启和关闭Agent审计的功能，当开启后，开始抓取用户的访问信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAgentNewRequest 请求对象
     * @return SyncInvoker<SwitchAgentNewRequest, SwitchAgentNewResponse>
     */
    public SyncInvoker<SwitchAgentNewRequest, SwitchAgentNewResponse> switchAgentNewInvoker(
        SwitchAgentNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.switchAgentNew, hcClient);
    }

    /**
     * 批量添加白名单
     *
     * 批量添加白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAuditWhitelistRequest 请求对象
     * @return BatchAddAuditWhitelistResponse
     */
    public BatchAddAuditWhitelistResponse batchAddAuditWhitelist(BatchAddAuditWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchAddAuditWhitelist);
    }

    /**
     * 批量添加白名单
     *
     * 批量添加白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAuditWhitelistRequest 请求对象
     * @return SyncInvoker<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse>
     */
    public SyncInvoker<BatchAddAuditWhitelistRequest, BatchAddAuditWhitelistResponse> batchAddAuditWhitelistInvoker(
        BatchAddAuditWhitelistRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchAddAuditWhitelist, hcClient);
    }

    /**
     * 添加sql自定义规则
     *
     * 添加sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditSqlRuleRequest 请求对象
     * @return CreateAuditSqlRuleResponse
     */
    public CreateAuditSqlRuleResponse createAuditSqlRule(CreateAuditSqlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.createAuditSqlRule);
    }

    /**
     * 添加sql自定义规则
     *
     * 添加sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuditSqlRuleRequest 请求对象
     * @return SyncInvoker<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse>
     */
    public SyncInvoker<CreateAuditSqlRuleRequest, CreateAuditSqlRuleResponse> createAuditSqlRuleInvoker(
        CreateAuditSqlRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.createAuditSqlRule, hcClient);
    }

    /**
     * 删除sql自定义规则
     *
     * 删除sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleSqlRequest 请求对象
     * @return DeleteAuditRuleSqlResponse
     */
    public DeleteAuditRuleSqlResponse deleteAuditRuleSql(DeleteAuditRuleSqlRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditRuleSql);
    }

    /**
     * 删除sql自定义规则
     *
     * 删除sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditRuleSqlRequest 请求对象
     * @return SyncInvoker<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse>
     */
    public SyncInvoker<DeleteAuditRuleSqlRequest, DeleteAuditRuleSqlResponse> deleteAuditRuleSqlInvoker(
        DeleteAuditRuleSqlRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditRuleSql, hcClient);
    }

    /**
     * 批量删除白名单
     *
     * 批量删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditWhitelistRequest 请求对象
     * @return DeleteAuditWhitelistResponse
     */
    public DeleteAuditWhitelistResponse deleteAuditWhitelist(DeleteAuditWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.deleteAuditWhitelist);
    }

    /**
     * 批量删除白名单
     *
     * 批量删除白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditWhitelistRequest 请求对象
     * @return SyncInvoker<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse>
     */
    public SyncInvoker<DeleteAuditWhitelistRequest, DeleteAuditWhitelistResponse> deleteAuditWhitelistInvoker(
        DeleteAuditWhitelistRequest request) {
        return new SyncInvoker<>(request, DbssMeta.deleteAuditWhitelist, hcClient);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesNewRequest 请求对象
     * @return ListSqlInjectionRulesNewResponse
     */
    public ListSqlInjectionRulesNewResponse listSqlInjectionRulesNew(ListSqlInjectionRulesNewRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listSqlInjectionRulesNew);
    }

    /**
     * 查询SQL注入规则策略
     *
     * 查询SQL注入规则策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlInjectionRulesNewRequest 请求对象
     * @return SyncInvoker<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse>
     */
    public SyncInvoker<ListSqlInjectionRulesNewRequest, ListSqlInjectionRulesNewResponse> listSqlInjectionRulesNewInvoker(
        ListSqlInjectionRulesNewRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listSqlInjectionRulesNew, hcClient);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhitelistsRequest 请求对象
     * @return ListWhitelistsResponse
     */
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listWhitelists);
    }

    /**
     * 查询白名单列表
     *
     * 查询白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhitelistsRequest 请求对象
     * @return SyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse>
     */
    public SyncInvoker<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelistsInvoker(
        ListWhitelistsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listWhitelists, hcClient);
    }

    /**
     * 开启关闭sql注入策略
     *
     * 开启关闭sql注入策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditSqlRuleSwitchRequest 请求对象
     * @return SetAuditSqlRuleSwitchResponse
     */
    public SetAuditSqlRuleSwitchResponse setAuditSqlRuleSwitch(SetAuditSqlRuleSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setAuditSqlRuleSwitch);
    }

    /**
     * 开启关闭sql注入策略
     *
     * 开启关闭sql注入策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditSqlRuleSwitchRequest 请求对象
     * @return SyncInvoker<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse>
     */
    public SyncInvoker<SetAuditSqlRuleSwitchRequest, SetAuditSqlRuleSwitchResponse> setAuditSqlRuleSwitchInvoker(
        SetAuditSqlRuleSwitchRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setAuditSqlRuleSwitch, hcClient);
    }

    /**
     * sql规则优先级排序
     *
     * sql规则优先级排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlRuleRankRequest 请求对象
     * @return SetSqlRuleRankResponse
     */
    public SetSqlRuleRankResponse setSqlRuleRank(SetSqlRuleRankRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.setSqlRuleRank);
    }

    /**
     * sql规则优先级排序
     *
     * sql规则优先级排序
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlRuleRankRequest 请求对象
     * @return SyncInvoker<SetSqlRuleRankRequest, SetSqlRuleRankResponse>
     */
    public SyncInvoker<SetSqlRuleRankRequest, SetSqlRuleRankResponse> setSqlRuleRankInvoker(
        SetSqlRuleRankRequest request) {
        return new SyncInvoker<>(request, DbssMeta.setSqlRuleRank, hcClient);
    }

    /**
     * 编辑sql自定义规则
     *
     * 编辑sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSqlRuleRequest 请求对象
     * @return UpdateAuditSqlRuleResponse
     */
    public UpdateAuditSqlRuleResponse updateAuditSqlRule(UpdateAuditSqlRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditSqlRule);
    }

    /**
     * 编辑sql自定义规则
     *
     * 编辑sql自定义规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditSqlRuleRequest 请求对象
     * @return SyncInvoker<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse>
     */
    public SyncInvoker<UpdateAuditSqlRuleRequest, UpdateAuditSqlRuleResponse> updateAuditSqlRuleInvoker(
        UpdateAuditSqlRuleRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditSqlRule, hcClient);
    }

    /**
     * 修改白名单
     *
     * 修改白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditWhitelistRequest 请求对象
     * @return UpdateAuditWhitelistResponse
     */
    public UpdateAuditWhitelistResponse updateAuditWhitelist(UpdateAuditWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.updateAuditWhitelist);
    }

    /**
     * 修改白名单
     *
     * 修改白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse>
     */
    public SyncInvoker<UpdateAuditWhitelistRequest, UpdateAuditWhitelistResponse> updateAuditWhitelistInvoker(
        UpdateAuditWhitelistRequest request) {
        return new SyncInvoker<>(request, DbssMeta.updateAuditWhitelist, hcClient);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return BatchAddResourceTagResponse
     */
    public BatchAddResourceTagResponse batchAddResourceTag(BatchAddResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchAddResourceTag);
    }

    /**
     * 批量添加资源标签
     *
     * 批量添加资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourceTagRequest 请求对象
     * @return SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse>
     */
    public SyncInvoker<BatchAddResourceTagRequest, BatchAddResourceTagResponse> batchAddResourceTagInvoker(
        BatchAddResourceTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchAddResourceTag, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return BatchDeleteResourceTagResponse
     */
    public BatchDeleteResourceTagResponse batchDeleteResourceTag(BatchDeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.batchDeleteResourceTag);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteResourceTagRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse>
     */
    public SyncInvoker<BatchDeleteResourceTagRequest, BatchDeleteResourceTagResponse> batchDeleteResourceTagInvoker(
        BatchDeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.batchDeleteResourceTag, hcClient);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return CountResourceInstanceByTagResponse
     */
    public CountResourceInstanceByTagResponse countResourceInstanceByTag(CountResourceInstanceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.countResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例数量
     *
     * 根据标签查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse>
     */
    public SyncInvoker<CountResourceInstanceByTagRequest, CountResourceInstanceByTagResponse> countResourceInstanceByTagInvoker(
        CountResourceInstanceByTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.countResourceInstanceByTag, hcClient);
    }

    /**
     * 获取实例标签
     *
     * 获取实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTagsRequest 请求对象
     * @return ListAuditTagsResponse
     */
    public ListAuditTagsResponse listAuditTags(ListAuditTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listAuditTags);
    }

    /**
     * 获取实例标签
     *
     * 获取实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditTagsRequest 请求对象
     * @return SyncInvoker<ListAuditTagsRequest, ListAuditTagsResponse>
     */
    public SyncInvoker<ListAuditTagsRequest, ListAuditTagsResponse> listAuditTagsInvoker(ListAuditTagsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listAuditTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return ListProjectResourceTagsResponse
     */
    public ListProjectResourceTagsResponse listProjectResourceTags(ListProjectResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listProjectResourceTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectResourceTagsRequest 请求对象
     * @return SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse>
     */
    public SyncInvoker<ListProjectResourceTagsRequest, ListProjectResourceTagsResponse> listProjectResourceTagsInvoker(
        ListProjectResourceTagsRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listProjectResourceTags, hcClient);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return ListResourceInstanceByTagResponse
     */
    public ListResourceInstanceByTagResponse listResourceInstanceByTag(ListResourceInstanceByTagRequest request) {
        return hcClient.syncInvokeHttp(request, DbssMeta.listResourceInstanceByTag);
    }

    /**
     * 根据标签查询资源实例列表
     *
     * 根据标签查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceByTagRequest 请求对象
     * @return SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse>
     */
    public SyncInvoker<ListResourceInstanceByTagRequest, ListResourceInstanceByTagResponse> listResourceInstanceByTagInvoker(
        ListResourceInstanceByTagRequest request) {
        return new SyncInvoker<>(request, DbssMeta.listResourceInstanceByTag, hcClient);
    }

}
