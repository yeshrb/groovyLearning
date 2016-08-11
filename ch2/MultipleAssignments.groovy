def splitName(fullName) { fullName.split(' ')}
def (firstName,lastName) = splitName('James Bond')
assert(firstName=='James') 
assert(lastName=='Bond') 

def name1 = "Thomson"
def name2 = "Thompson"

assert(name1=='Thomson') 
assert(name2=='Thompson') 
(name1,name2) = [name2,name1]
assert(name1=='Thompson') 
assert(name2=='Thomson') 


def (String cat,String mouse) = ['Tom','Jerry','Spike','Tyke']
assert(cat=='Tom') 
assert(mouse == 'Jerry') 

def (first,second, third) = ['Tom','Jerry']
assert(first=='Tom') 
assert(second == 'Jerry') 
assert(third==null)