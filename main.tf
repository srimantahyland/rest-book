terraform {
  cloud {
    organization = "srimantahyland"

    workspaces {
      name = "example-workspace"
    }
  }
}
