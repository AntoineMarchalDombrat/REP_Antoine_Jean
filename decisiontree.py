import pandas as pd
from sklearn.tree import DecisionTreeRegressor
from sklearn.tree import export_text

# Load CSV data
data = pd.read_csv("results.csv")

# Define features and target
X = data[['nombreEssais', 'tolerance']]
y = data['tauxReussite']

# Fit Decision Tree
tree = DecisionTreeRegressor(max_depth=3)
tree.fit(X, y)

# Display rules
tree_rules = export_text(tree, feature_names=['nombreEssais', 'tolerance'])
print(tree_rules)
