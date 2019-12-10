#! /usr/bin/env Rscript
library(DataExplorer)
jeju_data_party <- read.csv(file = "/home/FP/final_project/others/jeju.csv")
avg_credit_rat <- jeju_data_party$avg_credit_rat
vehicle_own_rat <- jeju_data_party$vehicle_own_rat
jeju_data_party2 <- cbind(jeju_data_party, vehicle_own_rat)
jeju_data_party2 <- cbind(jeju_data_party2, avg_credit_rat)
jeju_data_party2 <- jeju_data_party2[,-c(7)]
jeju_data_party <- jeju_data_party2
create_report(jeju_data_party, output_dir="/home/FP/final_project/flask/templates/")

